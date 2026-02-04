import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite o número da sua CNH (11 dígitos): ");
        String cnh;
        do{
            cnh = sc.nextLine();
            if(cnh.length() != 11){
                System.out.print("Sua CNH precisa ter 11 dígitos, insira novamente: ");
            }
        }while(cnh.length() != 11);

        Cliente cliente = new Cliente(nome, idade, cnh);

        System.out.println();

        System.out.println("Digite o número do modelo de carro desejado: ");
        System.out.println("(1) Básico - R$ 90.00");
        System.out.println("(2) Intermediário - R$ 110.00");
        System.out.println("(3) Luxo - R$ 200,00");
        int escolhaModelo = sc.nextInt();

        System.out.print("Digite o número de diárias desejadas: ");
        int diaria = sc.nextInt();

        String modelo;
        switch(escolhaModelo){
            case 1:
                modelo = "Básico";
                break;
            case 2:
                modelo = "Intermediário";
                break;
            case 3:
                modelo = "Luxo";
                break;
            default:
                modelo = "Não definido";
                break;
        }

        Aluguel aluguel = new Aluguel(modelo, diaria);
        aluguel.calcularValor(escolhaModelo);

        System.out.println("\nInformações do cliente: ");
        System.out.println();
        System.out.println(cliente);
        System.out.println(aluguel);


        sc.close();
    }

}