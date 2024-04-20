package org.revisao;

import java.util.Scanner;

public class Ex10 {
    // Crie um programa que recebe três valores
    // que representam os lados de um triângulo
    // e verifica se é um triângulo equilátero,
    // isósceles ou escaleno.

    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º cateto do triângulo");
        lado1 = scanner.nextInt();

        System.out.println("Digite o 2º cateto do triângulo");
        lado2 = scanner.nextInt();

        System.out.println("Digite a hipotenusa do triângulo");
        lado3 = scanner.nextInt();

        if (lado1 < 0 || lado2 < 0 || lado3 < 0){
            System.out.println("Tamanho(s) informado(s) inválidos");
            return;
        }

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Triângulo equilátero");
        } else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("Triângulo escaleno");
        } else {
            System.out.println("Triângulo isóceles");
        }

        if(Math.pow(lado1,2) + Math.pow(lado2,2) == Math.pow(lado3,2)){
            System.out.println("O triângulo é retângulo");
        } else {
            System.out.println("O triângulo não é retângulo");
        }
    }
}
