package org.revisao;

import java.util.Scanner;

public class Ex11 {
    // Uma empresa concederá um aumento
    // de salário aos seus funcionários,
    // variável de acordo com o cargo,
    // conforme a tabela abaixo.
    // Faça um programa que leia o salário
    // e o código do cargo de um funcionário
    // e calcule o seu novo salário.
    // Se o cargo do funcionário não estiver
    // na tabela, ele deverá, então,
    // receber 15% de aumento. Mostre o salário antigo,
    // o novo salário e a diferença entre ambos (tabela: ).

    public static void main(String[] args) {
        float salario, aumento, novoSalario;
        String codigo;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o salário:");
        salario = scanner1.nextFloat();

        System.out.println("Digite o código:");
        codigo = scanner2.nextLine();

        switch (codigo){
            case "310":
                aumento = (float) (salario*0.05);
                novoSalario = salario + aumento;
                break;
            case "456":
                aumento = (float) (salario*0.075);
                novoSalario = salario + aumento;
                break;
            case "885":
                aumento = (float) (salario*0.1);
                novoSalario = salario + aumento;
                break;
            default:
                aumento = (float) (salario*0.15);
                novoSalario = salario + aumento;
                break;
        }
        System.out.println("O salário inicial do funcionário é: " + salario);
        System.out.println("O aumento do funcionário é: " + aumento);
        System.out.println("O salário final do funcionário é: " + novoSalario);


    }
}
