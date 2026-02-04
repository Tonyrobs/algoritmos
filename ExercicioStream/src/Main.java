import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();
            while (line!= null) {
                String[] fields = line.split(",");
                list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

            }

            System.out.print("Enter salary: ");
            Double salarioEscolhido = sc.nextDouble();

            List<String> maiorQue = list.stream()
                    .filter(p -> p.getSalario() > salarioEscolhido)
                    .map(p -> p.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than: " + String.format("%.2f: ", salarioEscolhido));
            maiorQue.forEach(System.out::println);

            double totalValor = list.stream()
                    .filter(p -> p.getNome().charAt(0) == 'M')
                    .map(p -> p.getSalario())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f ", totalValor));


        }  catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}