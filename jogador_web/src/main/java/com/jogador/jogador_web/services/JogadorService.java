package com.jogador.jogador_web.services;

import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jogador.jogador_web.models.Jogador;

@Service
public class JogadorService {

    @ResponseBody
    public static Jogador GeradorJogador(String time, String pos) {
        String[] nomes = {"Lucas","Marcos","Miguel","Arthur"};
        String[] sobres = {"Americo","Oliveira","Martins","Machado"};

        Random rng = new Random();

        int idade = rng.nextInt(18,32);
        int valN = rng.nextInt(0,3);
        int valS = rng.nextInt(0,3);

        Jogador response = new Jogador(nomes[valN], sobres[valS], pos, idade, time);

        return response;
    }
}
