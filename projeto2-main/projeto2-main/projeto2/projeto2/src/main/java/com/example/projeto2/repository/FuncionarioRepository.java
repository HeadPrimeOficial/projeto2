package com.example.projeto2.repository;

import com.example.projeto2.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FuncionarioRepository extends JpaRepository <Funcionario,Long> {
}
