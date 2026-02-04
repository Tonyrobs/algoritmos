public class Main {
    public static void main(String[] args) {
        FormasGeometricas[] formas = {
                new Retangulo(5, 3),
                new Circulo(4),
                new Quadrado(6),
                new Hexagono(4),
                new Triangulo(4, 6, 5),
                new Pentagono(5, 5)
        };

        for (FormasGeometricas f : formas) {
            System.out.printf("\nÁrea: %.2f%n", f.area());
            System.out.printf("Perímetro: %.2f%n", f.perimetro());
            System.out.printf("\n______________");
        }
    }
}