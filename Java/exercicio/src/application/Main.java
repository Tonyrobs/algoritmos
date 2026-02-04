package application;

import java.util.Scanner;
import entities.Aluno;
import entities.Materia;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Materia[]materias = new Materia[4];
        materias[0] = new Materia("Matemática", "Joaquim", "MAT01", false, 8, 60);
        materias[1] = new Materia("Português", "Luciana", "POR02", false, 9, 60);
        materias[2] = new Materia("História", "Vagner", "HIS03", false, 11, 40);
        materias[3] = new Materia("Música", "Renata","MUS20", true, 14, 10);

        String nome, email, dataNascimento, status;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua data de nascimento: ");
        dataNascimento = sc.nextLine();

        System.out.print("Digite seu email ");
        email = sc.nextLine();

        Aluno aluno = new Aluno(nome, email, "Matriculado", dataNascimento);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMatérias disponíveis:");
            for (int i = 0 ; i < materias.length; i++) {
                System.out.println((i+1) + " - " + materias[i].getTitulo());
            }
            System.out.print("Digite o número da matéria para matricular: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1, 2, 3, 4 -> {
                    aluno.matricularMateria(materias[opcao - 1]);
                    System.out.println("Matéria matriculada!");
                    if (aluno.getMatriculas() >= 2) {
                        System.out.print("Quer matricular mais matérias? (s/n): ");
                        if (!sc.nextLine().equalsIgnoreCase("s")) {
                            continuar = false;
                        }
                    }
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
        System.out.println("\nInformações do aluno:");
        aluno.mostrarInformacao();

        sc.close();
	}

}
