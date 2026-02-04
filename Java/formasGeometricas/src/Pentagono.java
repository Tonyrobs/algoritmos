public class Pentagono extends FormasGeometricas{
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema){
        this.lado = lado;
        this.apotema = apotema;
    }
    public double area(){
        return (5 * lado * apotema) / 2;
    }
    public double perimetro(){
        return 5 * lado;
    }
}
