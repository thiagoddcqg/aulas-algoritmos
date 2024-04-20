package org.revisao;

import java.util.Scanner;

public class Ex1 {
    // Escreva um programa Java que receba um número de 1 a 7 e
    // imprima o dia da semana correspondente utilizando switch case.
    public static void main(String[] args) {
        int dia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana:");
        dia = scanner.nextInt();
        scanner.close();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana inválido");
                break;
        }
    }
}
