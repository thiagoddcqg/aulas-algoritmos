package org.revisao;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Crie um programa que realize operações simples de calculadora
        // (+, -, *, /) com dois números, utilizando switch case.

        double n1, n2, resultado=0;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
        n1 = scanner.nextDouble();
        System.out.println("Digite o 2º número:");
        n2 = scanner.nextDouble();

        System.out.println("+ - Adição");
        System.out.println("- - Subtração");
        System.out.println("* - Multiplicação");
        System.out.println("/ - Divisão");
        System.out.println("Digite a operação:");
        String op = scanner1.nextLine();
        scanner.close();

        switch(op){
            case "+":
                resultado = n1+n2;
                break;
            case "-":
                resultado = n1-n2;
                break;
            case "*":
                resultado = n1*n2;
                break;
            case "/":
                resultado = n1/n2;
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        System.out.println("O resultado é: " + resultado);
    }
}
