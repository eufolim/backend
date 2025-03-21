package com.aula3;

public class Estudante {
    String nome;
    String curso;
    Integer idade;
    Integer anoInicio;

    public Estudante(String nome,String curso,Integer idade, Integer anoInicio) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.anoInicio = anoInicio;
    }

    public void message() {
        System.out.println("Eu sou " + this.nome + ", tenho " + this.idade + " anos, entrei no curso de " + this.curso + " em " + this.anoInicio);
    }
}
