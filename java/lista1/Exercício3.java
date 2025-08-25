import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int a, b, c, d, dif;
		
		System.out.println("Digite quatro valores inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dif = (a*b-c*d);
		
		System.out.println("Diferença = " + dif);
		
		
		sc.close();
		
	}

}
