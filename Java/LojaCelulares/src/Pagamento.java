import java.util.Date;
import java.util.Scanner;

public class Pagamento {
    private double valor;
    private String formaPagamento;
    private Date dataPagamento;
    private OrdemServico ordemServico;
    private String status;

    public Pagamento(double valor, String formaPagamento, OrdemServico ordemServico) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataPagamento = new Date();
        this.status = "Pago";
        this.ordemServico = ordemServico;
    }
    public double getValor() {
        return valor;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void registrarPagamento(Scanner sc, double valorOS){
        this.valor = valorOS;
        System.out.print("Informe a forma de pagamento (Cartão, Pix, Dinheiro): ");
        this.formaPagamento = sc.nextLine();
        this.dataPagamento = new Date();
        this.status = "Pago";
    }
    

}