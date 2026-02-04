package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudante;

public class Main {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;


        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite suas três notas: ");

        do{
            nota1 = sc.nextDouble();
            if(nota1 <0.0 || nota1 > 30.0){
                System.out.println("Nota 1 inválida, digite novamente: ");
            }
        }while(nota1 <0.0 || nota1 > 30.0);

        do{
            nota2 = sc.nextDouble();
            if(nota2 <0.0 || nota2 > 35.0){
                System.out.println("Nota 2 inválida, digite novamente: ");
            }
        }while(nota2 <0.0 || nota2 > 35.0);

        do{
            nota3 = sc.nextDouble();
            if(nota3 <0.0 || nota3 >35.0){
                System.out.println("Nota 3 inválida, digite novamente: ");
            }
        }while(nota3 <0.0 || nota3 > 35.0);

        Estudante estudante = new Estudante(nome, nota1, nota2, nota3);


        System.out.println(estudante);

        sc.close();
	}

}
