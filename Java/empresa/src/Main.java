import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        ArrayList<Funcionario> list = new ArrayList<>();

        for(int i=0 ; i<n; i++){
            System.out.println();
            System.out.print("Funcionário #" + (i+1) + ":");

            System.out.print("\nId: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            while (hasId(list, id)) {
                System.out.print("Este id já existe, insira outro: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            sc.nextLine();

            list.add(new Funcionario(id, nome, salario));

        }

        System.out.print("\nDigite o id do funcionário que receberá aumento: ");
        int id = sc.nextInt();
        Funcionario funci = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(funci == null) {
            System.out.print("Este id não existe. ");
        }
        else{
            System.out.print("Digite a porcentagem de aumento: ");
            double porcent = sc.nextDouble();
            funci.aumentoSalario(porcent);
        }
        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }

            sc.close();
        }

        public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario funci = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funci != null;
    }
}