package com.deitel;

public class Empregado {

    String nome;
    String sobre;
    Double salario;
    
    public Empregado(String nome, String sobre, Double salario) {
        this.nome = nome;
        this.sobre = sobre;
        this.salario = salario;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    

}
