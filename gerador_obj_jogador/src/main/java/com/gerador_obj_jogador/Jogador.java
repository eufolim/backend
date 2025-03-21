package com.gerador_obj_jogador;

import java.util.Random;

public class Jogador {

    private String nome;
    private String sobre;
    private String pos;
    private int idade;
    private int num;

    public Jogador(String nome, String sobre, String pos, int idade, int num) {
        this.nome = nome;
        this.sobre = sobre;
        this.pos = pos;
        this.idade = idade;
        this.num = num;
    }

    public static Jogador geradorJogador() {
        String[] nomes = {"Lucas","Marcos","Miguel","Arthur"};
        String[] sobres = {"Americo","Oliveira","Martins","Machado"};
        String[] poses = {"Goleiro","Atacante","zagueiro","artilheiro"};

        Random rng = new Random();

        int nums = rng.nextInt(0,12);
        int idades = rng.nextInt(18,36);
        int[] val = {0,0,0};
        for (int i = 0; i < 3; i++) {
            val[i] = rng.nextInt(0,3);
        }
        
        Jogador j = new Jogador(nomes[val[0]], sobres[val[1]], poses[val[2]], idades, nums);
        return j;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
