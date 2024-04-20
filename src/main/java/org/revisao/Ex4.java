package org.revisao;

import java.util.Scanner;

public class Ex4 {
    // Utilizando “if” e “else”, escreva um
    // programa que verifica se um número é par ou ímpar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nº:");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }

        if(num < 0){
            System.out.println("É negativo");
        } else if(num > 0) {
            System.out.println("É positivo");
        } else {
            System.out.println("É neutro");
        }
    }
}
