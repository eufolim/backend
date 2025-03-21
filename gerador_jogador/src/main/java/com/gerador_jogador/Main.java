package com.gerador_jogador;

import java.util.Random;

public class Main {
    /* public static void main(String[] args) {
        System.out.println("Hello world!");
    } */
    
    public static void main(String[] args) {
        String[] nome = {"Lucas","Marcos","Miguel","Arthur"};
        String[] sobre = {"Americo","Oliveira","Martins","Machado"};
        String[] pos = {"Goleiro","Atacante","zagueiro","artilheiro"};
        String[] time = {"Bota Fogo","Corinthians","Gremio","são paulo"};

        Random rng = new Random();
        int idade = rng.nextInt(18, 34);
        int[] val = {0,0,0,0};
        for (int i = 0; i < 3; i++) {
            val[i] = rng.nextInt(0,3);
        }
        
        System.out.println(nome[val[0]] + " " + sobre[val[1]] + " é um futebolista brasileiro de " + idade + " anos que atua como " + pos[val[2]] + ". Atualmente defende o " + time[val[3]] + ".");
    }

}