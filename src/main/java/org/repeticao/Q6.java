package org.repeticao;

import java.util.Scanner;

public class Q6 {
    // Construa um programa que imprime
    // a soma de todos os valores positivos
    // digitados pelo usuário até que ele
    // informe um valor negativo.

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int num, soma=0;


        do{
            System.out.println("Digite algum número:");
            num = scanner.nextInt();

            soma = num>0 ? soma+num : soma;
            System.out.println("Soma: " + soma);
        }while (num>0);


    }
}
