import java.util.Scanner;
import java.util.Set;

public class Alunos {

    public static void lerAlunos(Scanner sc, Set<Integer> set) {
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int codigo = sc.nextInt();
            set.add(codigo);
        }
    }
}

