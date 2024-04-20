package org.revisao;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o 1º número:");
        num1 = scanner.nextInt();

        System.out.println("Digite o 2º número:");
        num2 = scanner.nextInt();

        if(num1 == num2){
            System.out.println("Eles são iguais");
        } else {
            System.out.println("Eles não são iguais");
        }
    }
}
