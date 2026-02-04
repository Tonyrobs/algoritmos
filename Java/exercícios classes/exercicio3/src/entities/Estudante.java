package entities;

public class Estudante {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    //Construtor
    public Estudante(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    //Getters
    public String getNome(){
        return nome;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public double getNota3(){
        return nota3;
    }
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }

    public double notaFinal(){
        return this.nota1 + this.nota2 + this.nota3;
    }
    public String resultado(){
        if (notaFinal() >= 60.0){
            return "PASSOU";
        }
        else{
            double pontosFaltantes = 60 - notaFinal();
            return String.format("FALTAM %.2f pontos", pontosFaltantes);
        }
    }
    public String toString(){
        return "\n"
        + nome
        + String.format("\nNota final: %.2f ", notaFinal())
        + "\n"
        + resultado();
    }

}

