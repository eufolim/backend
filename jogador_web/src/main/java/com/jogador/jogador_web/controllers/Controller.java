package com.jogador.jogador_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jogador.jogador_web.models.Jogador;
import com.jogador.jogador_web.services.JogadorService;



@RestController
@RequestMapping("")
public class Controller {

    @GetMapping("/jogador/{time}/{pos}")
    public Jogador getMethodName(@PathVariable String time, @PathVariable String pos) {
        Jogador jogador = JogadorService.GeradorJogador(time, pos);
        return jogador;
    }
    
    

}
