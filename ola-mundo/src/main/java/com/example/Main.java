package com.example;

public class Main {

    /* public static void main(String[] args) {
        String nome = "World";
        Integer[] labLista = {41, 42, 43};
        Random test = new Random();

        int labNumero = labLista[test.nextInt(0, labLista.length)];
        
        try (Scanner reader = new Scanner(System.in)) {
            String temp = reader.nextLine();
            if (!temp.isBlank()) {
                nome = temp;
            }
        }

        System.out.println("Hello " + nome + "! Welcome to lab " + labNumero);
    } */
   public static void main(String[] args) {
       int[] lista = {1,2,3};
       for (int i = 0; i < 3; i++) {
           System.out.println(lista[i]);
       }
   }
}
