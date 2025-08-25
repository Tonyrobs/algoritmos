package application;
import java.util.Scanner;
import java.util.Locale;

import entities.Funcionario;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu salário bruto: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o imposto aplicado: ");
        double imposto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salario, imposto);

        System.out.printf("\nFuncionário: %s, R$ %.2f " , nome, funcionario.salarioLiquido());

        System.out.print("\n\nDigite a porcentagem de aumento: ");
        double porcent = sc.nextDouble();

        funcionario.aumentoSalario(porcent);
        System.out.print(funcionario);

    sc.close();
    }
}