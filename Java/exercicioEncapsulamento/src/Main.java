import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        Account account;

        System.out.print("Digite o número de sua conta: ");
        String numeroConta = sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Há um deposito inicial? (s/n) ");
        char resposta = sc.nextLine().charAt(0);

        if(resposta == 's'){
            System.out.print("Digite o valor inicial: ");
            double depositoInicial = sc.nextDouble();
            account = new Account(numeroConta, nome, depositoInicial);
        }
        else{
            account = new Account(numeroConta, nome);
        }

        System.out.println("\nDados da conta: " + account);

        System.out.print("\nDigite o valor de depósito: ");
        double saldo = sc.nextDouble();
        account.addSaldo(saldo);

        System.out.println("Dados atualizados da conta: " + account);

        System.out.println("\nDigite o valor de saque: ");
        saldo = sc.nextDouble();
        account.removeSaldo(saldo);

        System.out.println("Dados atualizados da conta: " + account);


        sc.close();
    }
}
