public class Aluguel {
    private String modelo;
    private double valorFinal;
    private int diaria;
    private double basico = 90.0;
    private double intermediario = 110.0;
    private double luxo = 200.0;

    public Aluguel(String modelo, int diaria) {
        this.modelo = modelo;
        this.diaria = diaria;
        this.valorFinal = 0.0;
    }

    public String getModelo() {
        return modelo;
    }

    public int getDiaria() {
        return diaria;
    }

    public double getValorFinal(){
        return valorFinal;
    }

    public double calcularValor(int escolhaModelo){

        switch(escolhaModelo){
            case 1:
                valorFinal = basico * diaria;
                break;
            case 2:
                valorFinal = intermediario * diaria;
                break;
            case 3:
                valorFinal = luxo * diaria;
                break;
            default:
                valorFinal = 0.0;
                break;
        }
        return valorFinal;
    }

    public String toString(){
        return "Modelo do carro: " + modelo + "\nNúmero de diárias: " + diaria + "\nValor total: R$ "
        + String.format("%.2f", valorFinal);
    }
}
