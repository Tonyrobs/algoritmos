public class Cavalo extends Animal{
    public Cavalo(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }
    @Override
    public String fazerSom(){
        return "Hiiiinnn";
    }
}
