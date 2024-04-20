package org.revisao;

import java.util.Scanner;

public class Ex6 {
    //2. Entrar com um número e imprimir a
    // raiz quadrada do número, caso ele seja  positivo.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite um número:");
        num = scanner.nextInt();
        scanner.close();

        double res = 3.333333;

        if(num > 0){
            // System.out.println("Raiz do número é: " + Math.sqrt(num));
            String result = String.format("%.2f", res);
            System.out.println("Nº formatado:" + result);
        } else {
            System.out.println("Número negativo");
        }

    }
}
