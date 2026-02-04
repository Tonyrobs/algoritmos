public class Account {
    private String numeroConta;
    private String nome;
    private double saldo;

    public Account(String numeroConta, String nome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        addSaldo(depositoInicial);
    }
    public Account(String numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double saldo){
        this.saldo += saldo;
    }
    public void removeSaldo(double saldo){
        this.saldo -= saldo + 5.00;
    }
    public String toString(){
        return "\nConta: "
        + numeroConta
        + ", Titular: "
        + nome
        + String.format(", Saldo: R$ %.2f", saldo);
    }
}
