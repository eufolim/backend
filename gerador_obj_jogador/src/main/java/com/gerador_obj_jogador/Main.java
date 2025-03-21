package com.gerador_obj_jogador;

public class Main {
    /* public static void main(String[] args) {
        System.out.println("Hello world!");
    } */
    
    public static void main(String[] args) {
        Jogador j1 = Jogador.geradorJogador();    
    
        System.out.println( j1.getNome() + " " + j1.getSobre() + " é um futebolista brasileiro de " + j1.getIdade() + " anos que atua como " + j1.getPos() + ". Atualmente vestindo a camisa " + j1.getNum());
    }
}