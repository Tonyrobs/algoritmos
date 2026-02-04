import java.util.Date;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class OrdemServico {
    private Date dataEntrada;
    private Date dataSaida;
    private String defeito;
    private String descricaoProblema;
    private double valorTotal;
    private String status;
    private Aparelho aparelho;
    private Cliente cliente;
    private int numeroOS;
    private Pagamento pagamento;
    private List<Peca>pecasUtilizadas;

    public OrdemServico(Date dataEntrada, Date dataSaida, String defeito, String descricaoProblema, double valorTotal, String status, Aparelho aparelho, Cliente cliente) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.defeito = defeito;
        this.descricaoProblema = descricaoProblema;
        this.valorTotal = valorTotal;
        this.status = "Em andamento";
        this.aparelho = aparelho;
        this.cliente = cliente;
        gerarNumeroOS();
        this.pecasUtilizadas = new ArrayList<>();
    }
    public Date getDataEntrada() { return dataEntrada; }
    public Date getDataSaida() { return dataSaida; }
    public String getDefeito() { return defeito; }
    public String getDescricaoProblema() { return descricaoProblema; }
    public double getValorTotal() { return valorTotal; }
    public String getStatus() { return status; }
    public Aparelho getAparelho() { return aparelho; }
    public Cliente getCliente() { return cliente; }
    public int getNumeroOS() { return numeroOS; }
    public List<Peca> getPecasUtilizadas(){ return pecasUtilizadas; }

    public static OrdemServico registrarOrdemServico(Scanner sc, Aparelho aparelho, Cliente cliente) {
        System.out.print("Defeito do aparelho: ");
        String defeito = sc.nextLine();

        System.out.print("Descrição do problema: ");
        String descricao = sc.nextLine();

        return new OrdemServico(
                new Date(), null, defeito, descricao, 0.0, "Em andamento",
                aparelho, cliente);
    }

    public double calcularValorTotal() {
        double soma = 0;
        for(Peca p : pecasUtilizadas){
            soma += p.getPreco();
        }
        this.valorTotal = soma;
        return soma;
    }
    public void gerarNumeroOS(){
        Random gerador = new Random();
        this.numeroOS = 10000 + gerador.nextInt(90000);
    }
    public void finalizarOS(){
        this.status = "Finalizado";
        this.dataSaida = new Date();
    }
    public void cancelarOS(){
        this.status = "Cancelado";
        this.dataSaida = new Date();
    }
    public void adicionarPeca(Peca peca){
        pecasUtilizadas.add(peca);
        System.out.println("Peça " + peca.getNome() + " adicionada à OS.");
    }
    public void registrarPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
        this.status = "Paga";
    }


    public void exibirDetalhes(){
        System.out.println("--- Detalhes da OS #" + numeroOS + " ---");
        System.out.println("Cliente: " + cliente.getNome() + " | Aparelho: " + aparelho.getModelo());
        System.out.println("Defeito: " + defeito);
        System.out.println("Descrição: " + descricaoProblema);
        System.out.println("Status: " + status);
        System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));
        System.out.println("---------------------------------");
    }
}