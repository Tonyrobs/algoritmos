import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int x; int y;
		System.out.println("Digite dois valores inteiros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		int soma = x+y;
		
		System.out.print("SOMA = " + soma);
		
		sc.close();
		
	}

}
