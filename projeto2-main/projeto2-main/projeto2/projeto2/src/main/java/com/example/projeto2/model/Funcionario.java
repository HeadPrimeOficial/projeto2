package com.example.projeto2.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "tab_funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;

    @Column(nullable = false)
    private String nome;
    private String cpf;
    private String rg;
    private Integer matricula;
    private String dataNascimento;
    private Double salario;
    private String telefone;
    private String email;


    public Funcionario() {
    }

    public Funcionario(String email, String telefone, Double salario, String dataNascimento, Integer matricula, String rg, String cpf, String nome, Long id) {
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", matricula=" + matricula +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salario=" + salario +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
