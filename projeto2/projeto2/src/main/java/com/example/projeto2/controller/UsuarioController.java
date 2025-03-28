package com.example.projeto2.controller;


import com.example.projeto2.model.Usuario;
import com.example.projeto2.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> listarTodos(){
        return  usuarioRepository.findAll();

    }


    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);

    }



    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario){
        if(usuario.getId() != null && usuarioRepository.existsById(id)) {
            usuarioRepository.save(usuario);
            return  ResponseEntity.ok().body(usuario);
        } else {
            throw  new RuntimeException("Usuário não encontrado");
        }
    }


    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deletar(@PathVariable Long id){
        usuarioRepository.deleteById(id);
        return  ResponseEntity.noContent().build();


    }

}
