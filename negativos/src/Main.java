import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[]vect = new int[n];

        for(int i=0; vect.length>i; i++){
                System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();
                while(vect[i]>10){
                    System.out.print("Número precisa ser até 10\n");
                    vect[i] = sc.nextInt();
                }
        }
        System.out.println("Números negativos: ");
        for(int i=0; vect.length>i; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}