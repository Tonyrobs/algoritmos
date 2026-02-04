import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double temp=0;

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[]vect = new double[n];

        for (int i=0; vect.length>i; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for (int i=0; vect.length>i; i++){
            System.out.print(vect[i] + " ");
        }
        System.out.println("\nSOMA =");
        for (int i=0; vect.length>i; i++){
            double soma = vect[i];
            temp += soma;
        }
        System.out.print(temp);
        double media2 = temp / vect.length;

        System.out.print("\nMédia: ");
        for (int i=0; vect.length>i; i++){
            double media = vect[i];
            temp += media;
        }
        System.out.printf("%.2f", media2);


        sc.close();
    }
}