import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        if (validaCPF(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

        sc.close();
    }

    public static boolean validaCPF(String cpf) {

        cpf = cpf.replaceAll("\\D", "");


        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        for (int j = 9; j < 11; j++) {
            int soma = 0;
            for (int i = 0; i < j; i++) {
                soma += Character.getNumericValue(cpf.charAt(i)) * (j + 1 - i);
            }
            int resto = soma % 11;
            int digitoVerificador = (resto < 2) ? 0 : 11 - resto;

            if (digitoVerificador != Character.getNumericValue(cpf.charAt(j))) {
                return false;
            }
        }

        return true;
    }
}
