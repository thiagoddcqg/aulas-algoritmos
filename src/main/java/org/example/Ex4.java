package org.example;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        // Qualquer número natural de quatro algarismos pode ser
        // dividido em duas  dezenas formadas pelos seus dois primeiros
        // e dois últimos dígitos. (1297 = 12  e 97; 5314 = 53 e 14).
        // Escreva um algoritmo que lê um número inteiro n
        // (de 4  algarismos) e verifica se a raiz quadrada de n é igual
        // a soma das dezenas de n.

        Scanner scan = new Scanner(System.in);

        int numero;
        double raiz;

        System.out.println("Digite um número de 4 dígitos:");
        numero = scan.nextInt();
        scan.close();

        if(String.valueOf(numero).length() != 4){
            System.out.println("Valor fora do formato pedido");
            return;
        }

        int dezena1 = numero/100;
        int dezena2 = numero%100;
        int somaDezenas = dezena1 + dezena2;
        raiz = Math.sqrt(numero);
        System.out.println("1ª dezena: " + dezena1 + "\n"
                + "2ª dezena: " + dezena2 + "\n"
                + "Raiz: " + raiz);

        if(somaDezenas == raiz){
            System.out.println("A raiz é igual à soma das dezenas");
        } else {
            System.out.println("A raiz não é igual à soma das dezenas");
        }
    }
}
