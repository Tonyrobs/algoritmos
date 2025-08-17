import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int code1, code2, unit1, unit2;
		double prec1, prec2, result;
		
		System.out.println("Digite respectivamente: o código da peça, número de peças e valor unitário da peça 1 ");
		code1 = sc.nextInt();
		unit1 = sc.nextInt();
		prec1 = sc.nextDouble();
		
		System.out.println("\nAgora digite respectivamente: o código da peça, número de peças e valor unitário da peça 2: ");
		code2 = sc.nextInt();
		unit2 = sc.nextInt();
		prec2 = sc.nextDouble();
		
		result = unit1 * prec1 + unit2 * prec2;
		
		System.out.printf("Valor a pagar: R$ %.2f ", result);
		
		sc.close();
		
	  }

  }
}
