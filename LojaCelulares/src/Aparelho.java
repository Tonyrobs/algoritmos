import java.util.Scanner;

public class Aparelho {
    private String modelo;
    private String imei;

    public Aparelho(String modelo, String imei) {
        this.modelo = modelo;
        this.imei = imei;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }

    public static Aparelho cadastrarAparelho(Scanner sc) {
        System.out.print("Modelo do aparelho: ");
        String modelo = sc.nextLine();

        System.out.print("IMEI: ");
        String imei = sc.nextLine();

        return new Aparelho(modelo, imei);
    }

    public void editarAparelho(Scanner sc) {
        System.out.print("Novo modelo (" + this.modelo + "): ");
        String novoModelo = sc.nextLine();
        if (!novoModelo.isEmpty()) this.modelo = novoModelo;

        System.out.print("Novo IMEI (" + this.imei + "): ");
        String novoImei = sc.nextLine();
        if (!novoImei.isEmpty()) this.imei = novoImei;

        System.out.println("Aparelho editado com sucesso.");
    }


}