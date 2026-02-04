import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        Map < LogEntry, Integer > contagem = new HashMap < > ();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                String nome = fields[0];
                int votos = Integer.parseInt(fields[1]);

                LogEntry candidato = new LogEntry(nome, votos);

                if (contagem.containsKey(candidato)) {
                    int votosAteAgora = contagem.get(candidato);
                    contagem.put(candidato, votos + votosAteAgora);
                } else {
                    contagem.put(candidato, votos);
                }
                line = br.readLine();
            }
        }  catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
        }

        for(LogEntry key: contagem.keySet()) {
            System.out.println(key + ": " + contagem.get(key));
        }
        sc.close();
    }
}