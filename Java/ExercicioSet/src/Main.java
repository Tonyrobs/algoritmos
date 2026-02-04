import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        Alunos.lerAlunos(sc, set);

        System.out.print("How many students for course B? ");
        Alunos.lerAlunos(sc, set);

        System.out.print("How many students for course C? ");
        Alunos.lerAlunos(sc, set);

        System.out.println("Total users: " + set.size());

    }
}
