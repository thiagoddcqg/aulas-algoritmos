package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioEstruturaCondicional6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();
        System.out.print("Digite o código de condição (c para crescente, d para decrescente): ");
        char codigo = scanner.next().charAt(0);
        scanner.close();

        if (codigo == 'c') {
            ordenaCrescente(valor1, valor2, valor3);
        } else if (codigo == 'd') {
            ordenaDecrescente(valor1, valor2, valor3);
        } else {
            System.out.println("Código inválido. Use 'c' para crescente ou 'd' para decrescente.");
        }
    }

    public static void ordenaCrescente(int valor1, int valor2, int valor3) {
        int[] valores = {valor1, valor2, valor3};
        Arrays.sort(valores);
        System.out.println("Valores em ordem crescente: " + valores[0] + ", " + valores[1] + ", " + valores[2]);
    }

    public static void ordenaDecrescente(int valor1, int valor2, int valor3) {
        int[] valores = {valor1, valor2, valor3};
        Arrays.sort(valores);
        System.out.println("Valores em ordem decrescente: " + valores[2] + ", " + valores[1] + ", " + valores[0]);
    }
}

