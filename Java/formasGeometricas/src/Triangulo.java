public class Triangulo extends FormasGeometricas{
    private double base;
    private double altura;
    private double lado;

    public Triangulo(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    public double area(){
        return (base * altura) / 2;
    }
    public double perimetro(){
        return 3 * lado;
    }
}
