package com.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            String[][] cidades = {{"Tóquio","Rio de Janeiro"},{"Paris","Noruega"}};
 
            System.out.println("Pergunta 1: Você prefere clima quente ou frio?\n1. Quente\n2. Frio\n");

            int v1 = reader.nextInt() - 1;
            
            System.out.println("Pergunta 2: Você gosta mais de natureza ou cidade?\n1. Cidade\n2. Natureza\n");

            int v2 = reader.nextInt() - 1;

            System.out.print("Você deve ir para " + cidades[v1][v2]);
        }
    }
}