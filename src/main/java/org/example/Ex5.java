package org.example;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Digite um número ae");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }

        if (n > 0) {
            System.out.println("É positivo");
        } else if (n < 0) {
            System.out.println("É negativo");
        } else {
            System.out.println("É zero");
        }
    }
}
