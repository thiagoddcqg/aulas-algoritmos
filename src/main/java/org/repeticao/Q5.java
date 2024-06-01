package org.repeticao;

public class Q5 {
    // Imprimir todos os números de 1 até 100
    // e a soma dos números pares.

    public static void main(String[] args) {
        int i=0, soma=0;
        for(int j = 0; j <= 100; j++){
            System.out.println("A nº é: " + j);
            soma = (j%2==0 ?
                soma + j
                : soma);
        }
        System.out.println("Soma: "+soma);
    }
}
