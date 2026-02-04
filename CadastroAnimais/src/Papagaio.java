public class Papagaio extends Animal{
    public Papagaio(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }
    @Override
    public String fazerSom(){
        return "Repete o que você disse";
    }
}
