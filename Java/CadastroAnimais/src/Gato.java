public class Gato extends Animal{
    public Gato(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }
    @Override
    public String fazerSom(){
        return "Miau";
    }
}
