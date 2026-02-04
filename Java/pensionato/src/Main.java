import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        System.out.println();

        Aluguel[]vect = new Aluguel[10];

        for(int i=0; i<n; i++){
            System.out.print("Aluguel #" + (i+1));
            sc.nextLine();

            System.out.print("\nNome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto (0-9): ");
            int quarto = sc.nextInt();

            vect[quarto] = new Aluguel(nome, email);

            System.out.println();
        }
        System.out.println("Quartos ocupados: ");
        for(int i=0; i<10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}