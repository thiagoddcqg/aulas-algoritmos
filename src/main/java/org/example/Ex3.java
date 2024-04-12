package org.example;

import java.util.Scanner;

public class Ex3 {
    // Elaborar um algoritmo que, dada a idade de um nadador,
    // classificá-lo nas  categorias: infantil A (5 - 7 anos),
    // infantil B (8 -10 anos),
    // juvenil A (11 - 13  anos),
    // juvenil B (14 -17 anos) e adulto (maiores que 18 anos).

    public static void main(String[] args) {
        Scanner qlqrUm = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade do nadador");
        idade = qlqrUm.nextInt();
        qlqrUm.close();

        if(idade >= 5 && idade <= 7) {
            System.out.println("Classificação: infantil A");
        } else if(idade >= 8 && idade <= 10){
            System.out.println("Classificação: infantil B");
        } else if(idade >= 11 && idade <= 13){
            System.out.println("Classificação: juvenil A");
        } else if(idade >= 14 && idade <= 17){
            System.out.println("Classificação: juvenil B");
        } else if(idade >= 18){
            System.out.println("Classificação: adulto");
        } else {
            System.out.println("Classificação: idade não válida");
        }
    }
}
