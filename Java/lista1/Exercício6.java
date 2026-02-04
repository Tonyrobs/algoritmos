import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double a, b, c, triang, circ, trap, quadr, retan, pi=3.14159;
		
		System.out.println("Digite três valores: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triang = a*c/2.0;
		circ = pi * c * c;
		trap = ((a+b) * c) / 2.0;
		quadr = b * b;
		retan = a * b;
		
		System.out.printf("\nTriângulo = %.3f ", triang);
		System.out.printf("\nCírculo = %.3f ", circ);
		System.out.printf("\nTrapézio = %.3f ", trap);
		System.out.printf("\nQuadrado = %.3f ", quadr);
		System.out.printf("\nRetângulo = %.3f ", retan);
		
		sc.close();
		
	}

}
