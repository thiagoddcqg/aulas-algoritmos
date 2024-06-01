package org.repeticao;

public class Q4 {

    //Imprimir o quadrado dos números de 1 até 20.
    public static void main(String[] args) {

        int i = 0;

        while (i <= 20){
            System.out.println("O quadrado de " + i + " é: "+ (int) Math.pow(i,2));
            i++;
        }

        System.out.println("");
    }
}
