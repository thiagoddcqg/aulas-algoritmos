package org.example;

import java.util.Scanner;

public class ExercicioEstruturaCondicional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        scanner.close();

        String categoria = classificarNadador(idade);
        System.out.println("O nadador pertence à categoria: " + categoria);
    }

    public static String classificarNadador(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else {
            return "Adulto";
        }
    }
}

