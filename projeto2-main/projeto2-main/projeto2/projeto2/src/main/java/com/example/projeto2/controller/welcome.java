package com.example.projeto2.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
@RequestMapping ("/")

    public String welcome(){
        return "Bem-Vindo";
    }

}
