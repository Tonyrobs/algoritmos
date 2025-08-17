import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		double raio;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio do círculo: ");
		raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2.0);
		System.out.printf("A área do círculo é: %.4f ", area);
		
		sc.close();
		
	}

}
