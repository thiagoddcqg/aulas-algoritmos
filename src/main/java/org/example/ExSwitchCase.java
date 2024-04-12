package org.example;

import java.util.Scanner;

public class ExSwitchCase {
    public static void main(String[] args) {
        int n1, n2, op;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1º número:");
        n1 = scanner.nextInt();

        System.out.println("2º número:");
        n2 = scanner.nextInt();

//        System.out.println("Digite uma opção abaixo:");
//        System.out.println("1 - Soma");
//        System.out.println("2 - Subtração");
//        System.out.println("3 - Multiplicação");
//        System.out.println("4 - Divisão");

        System.out.println("""
                        Digite uma opção abaixo:
                        
                        1 - Soma
                        2 - Subtração
                        3 - Multiplicação
                        4 - Divisão
                        5 - Potência ao quadrado
                        6 - Raiz
                        7 - Resto
                        """);
        op = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println("Soma: " + (n1+n2));
                break;
            case 2:
                System.out.println("Subtração: " + (n1-n2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (n1*n2));
                break;
            case 4:
                System.out.println("Divisão: " + (n1/n2));
                break;
            case 5:
                System.out.println("Potência ao quadrado: " + Math.pow(n1, 2));
                break;
            case 6:
                System.out.println("Raiz: " + Math.sqrt(n1));
                break;
            case 7:
                System.out.println("Resto: " + (n1%n2));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
