package org.revisao;

import java.util.Scanner;

public class Ex9 {
    // Faça um programa que verifica se um
    // caractere digitado é uma vogal ou consoante.

    public static void main(String[] args) {
        char letra;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("O caracter " + letra + " é vogal");
        } else {
            System.out.println("O caracter " + letra + " é consoante");
        }

    }
}
