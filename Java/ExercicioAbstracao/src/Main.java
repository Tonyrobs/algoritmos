import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            sc.nextLine();
            System.out.print("Individual or company (i/c)? ");
            char opcao = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(opcao == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else if(opcao == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        double totalTaxas = 0.0;
        System.out.print("\nTAXES PAID: ");
        for(TaxPayer taxa : list){
            System.out.print(taxa.getName() + ": $ " + String.format("%.2f", taxa.tax()));
            System.out.println();
            totalTaxas += taxa.tax();
        }
        System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxas));


        sc.close();
    }
}