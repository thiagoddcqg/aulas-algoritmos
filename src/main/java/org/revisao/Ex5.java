package org.revisao;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Digite o 1º nº:");
        num1 = scanner.nextInt();

        System.out.println("Digite o 2º nº:");
        num2 = scanner.nextInt();

        soma = num1+num2;

        if(soma > 20){
            System.out.println("O resultado é: " + (soma+8));
        } else {
            System.out.println("O resultado é: " + soma);
        }


    }
}
