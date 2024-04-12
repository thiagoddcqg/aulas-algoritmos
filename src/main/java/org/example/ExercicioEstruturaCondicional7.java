package org.example;

import java.util.Scanner;

public class ExercicioEstruturaCondicional7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o salário e o código do cargo
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o código do cargo (1, 2, 3 ou 4): ");
        int codigoCargo = scanner.nextInt();
        scanner.close();

        // Calculando o novo salário de acordo com o cargo
        double novoSalario;

        if (codigoCargo == 1) {
            novoSalario = salario * 1.1; // Aumento de 10% para cargo 1
        } else if (codigoCargo == 2) {
            novoSalario = salario * 1.2; // Aumento de 20% para cargo 2
        } else if (codigoCargo == 3) {
            novoSalario = salario * 1.3; // Aumento de 30% para cargo 3
        } else if (codigoCargo == 4) {
            novoSalario = salario * 1.4; // Aumento de 40% para cargo 4
        } else {
            novoSalario = salario * 1.15; // Aumento padrão de 15% para outros cargos
        }

        // Calculando a diferença entre os salários
        double diferenca = novoSalario - salario;

        // Exibindo os resultados
        System.out.println("Salário antigo: R$" + salario);
        System.out.println("Novo salário: R$" + novoSalario);
        System.out.println("Diferença: R$" + diferenca);
    }
}
