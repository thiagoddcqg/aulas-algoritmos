package org.revisao;

import java.util.Scanner;

public class Ex3 {
    // Escreva um programa Java que receba um número de 1 a 7 e
    // imprima o dia da semana correspondente utilizando switch case.
    public static void main(String[] args) {
        int mes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o mês:");
        mes = scanner.nextInt();
        scanner.close();

        switch (mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
