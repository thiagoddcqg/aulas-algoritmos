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

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
         || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            System.out.println("O caracter " + letra + " é vogal");
        } else if(letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9') {
            System.out.println("O caracter " + letra + " é numeral");
        } else {
            System.out.println("O caracter " + letra + " é consoante");
        }

    }
}
