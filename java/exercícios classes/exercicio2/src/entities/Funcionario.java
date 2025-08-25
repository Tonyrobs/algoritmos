package entities;

public class Funcionario {
    private String nome;
    private double salario;
    private double imposto;

    //Construtor
    public Funcionario(String nome, double salario, double imposto) {
        this.nome = nome;
        this.salario = salario;
        this.imposto = imposto;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public double getImposto() {
        return imposto;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double salarioLiquido(){
        return this.salario - imposto;
    }
    public void aumentoSalario(double porcent){
        double valorAumento = this.salario * (porcent/100.0);
        this.salario = this.salarioLiquido() + valorAumento;
    }
    public String toString(){
        return String.format("\nDados atualizados: %s, R$ %.2f ", nome, salario);

    }
}
