package com.jogador.jogador_web.models;

public class Jogador {

    private String nome;
    private String sobre;
    private String pos;
    private int idade;
    private String time;

    public Jogador(String nome, String sobre, String pos, int idade, String time) {
        this.nome = nome;
        this.sobre = sobre;
        this.pos = pos;
        this.idade = idade;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
