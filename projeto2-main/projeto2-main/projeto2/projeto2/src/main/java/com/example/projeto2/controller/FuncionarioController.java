package com.example.projeto2.controller;

import com.example.projeto2.model.Funcionario;
import com.example.projeto2.repository.FuncionarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
@NoArgsConstructor
public class FuncionarioController {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;

    }

    @GetMapping
    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salva(@RequestBody Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        if (funcionario.getId() != null && funcionarioRepository.existsById(id)) {
            funcionarioRepository.save(funcionario);
            return ResponseEntity.ok().body(funcionario);

        } else {
            throw new RuntimeException("Funcionario não encontrado");
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }
}