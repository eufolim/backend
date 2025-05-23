package com.deitel;

public class Main {
   
    public static void faturaTest() {
        Fatura F1 = new Fatura("001","Compra de mouses", 5, 10.5);
        System.out.println(F1.getTotalFatura());
    }

    public static void empregadoTeste() {
        Empregado E1 = new Empregado("Luiz", "Frey", 1000.0);
        Empregado E2 = new Empregado("Miguel", "Arthur", 1000.0);
        System.out.println("E1: " + E1.getSalario());
        System.out.println("E2: " + E2.getSalario());
        System.out.println("Aumento de 10%!!!");
        E1.setSalario(E1.getSalario() * 1.1);
        E2.setSalario(E2.getSalario() * 1.1);
        System.out.println("E1: " + E1.getSalario());
        System.out.println("E2: " + E2.getSalario());
    }

    public static void testData() {
        Data data = new Data(06, 01, 2004);
        data.displayData();
    }

    public static void main(String[] args) {
        /* System.out.println("Hello world!"); */
        faturaTest();
        empregadoTeste();
        testData();
    }
}