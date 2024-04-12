package org.example;

import java.util.Scanner;

public class ExercicioEstruturaCondicional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro de 4 algarismos: ");
        int numero = scanner.nextInt();
        scanner.close();

        int dezenas = (numero / 100) + (numero % 100);
        double raizQuadrada = Math.sqrt(numero);

        if (raizQuadrada == dezenas) {
            System.out.println("A raiz quadrada de " + numero + " é igual à soma das dezenas.");
        } else {
            System.out.println("A raiz quadrada de " + numero + " não é igual à soma das dezenas.");
        }
    }
}
