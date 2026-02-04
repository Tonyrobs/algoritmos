import java.util.Scanner;

public class Peca {
    private String peca;
    private int quantEstoque;
    private double preco;

    public Peca(String peca, int quantEstoque, double preco) {
        this.peca = peca;
        this.quantEstoque = quantEstoque;
        this.preco = preco;
    }

    public String getNome() { return peca; }
    public int getQuantEstoque() { return quantEstoque; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setNome(String peca) { this.peca = peca; }
}