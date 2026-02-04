package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Digite largura e altura de um retângulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.println(retangulo);

        sc.close();
    }
}
