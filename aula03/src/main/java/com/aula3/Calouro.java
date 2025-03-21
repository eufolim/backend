package com.aula3;

public class Calouro extends Estudante {
    
    public Calouro(String nome, String curso, Integer idade, Integer anoInicio) {
        super(nome, curso, idade, anoInicio);
    }
    
    @Override
    public void message() {
        System.out.println("Eu sou " + this.nome + ", tenho " + this.idade + " anos, entrei no curso de " + this.curso + " esse ano");
    }

}
