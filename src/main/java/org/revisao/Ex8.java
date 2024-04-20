package org.revisao;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        // De 4 em 4 anos é ano bissexto.
        // De 100 em 100 anos não é ano bissexto.
        // De 400 em 400 anos é ano bissexto.
        // Prevalecem as últimas regras sobre as primeiras.

        Scanner scanner = new Scanner(System.in);
        int ano;
        System.out.println("Coloque o ano q você deseja verificar se é bissexto:");
        ano = scanner.nextInt();

        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }
    }
}
