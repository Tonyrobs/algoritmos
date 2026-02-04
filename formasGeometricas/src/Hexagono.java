public class Hexagono extends FormasGeometricas{
    private double lado;

    public Hexagono(double lado){
        this.lado = lado;
    }
    public double area(){
        return (3 * lado * Math.sqrt(3) / 2);
    }
    public double perimetro(){
        return 6 * lado;
    }
}
