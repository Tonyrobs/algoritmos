import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Insira os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento (DD/MM/YYYY): ");
        Date dataNascimento = sdf.parse(sc.next());

        Client client = new Client(nome, email, dataNascimento);

        System.out.print("Quantos produtos para esse pedido? ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Status: ");
        String orderStatus = sc.nextLine();

        Order pedido = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        System.out.println("Insira os dados do pedido: ");
        for(int i=1 ; i<=n ; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Product price: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantidade, preco, new Product(nomeProduto, preco));
            pedido.addItem(orderItem);

            sc.nextLine();
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.print("Order moment: " + sdf2.format(pedido.getMoment()) + "\n");
        System.out.print("Order status: " + pedido.getStatus() + "\n");
        System.out.print(client + "\n");
        System.out.println("Order items: ");
        System.out.print(pedido);
        System.out.print("Total do pedido: " + String.format("R$ %.2f", pedido.total()));


        sc.close();
    }
}