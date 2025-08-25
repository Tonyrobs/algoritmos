import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int num, horas;
		double valor, salario;
		
		System.out.println("Digite seu número de registro: ");
		num = sc.nextInt();
		
		System.out.println("Digite o seu número de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.println("Digite o valor recebido por hora: ");
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.printf("Número = %d \nSalário = U$ %.2f ", num, salario);
		
		sc.close();
		
	}
