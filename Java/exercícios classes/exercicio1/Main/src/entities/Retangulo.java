package entities;

public class Retangulo {

    public double largura;
    public double altura;

    public double area(){
        return largura * altura;
    }
    public double perimetro(){
        return (largura + altura) * 2;
    }
    public double diagonal(){
        return Math.sqrt((largura*largura) + (altura*altura));
    }
    public String toString() {
        return "AREA: "
                + String.format("%.2f" , area())
                + "\nPERIMETRO:"
                + String.format("%.2f", perimetro())
                + "\nDIAGONAL: "
                + String.format("%.2f", diagonal());
    }
}
