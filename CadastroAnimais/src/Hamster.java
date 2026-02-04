public class Hamster extends Animal{
    public Hamster(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }
    @Override
    public String fazerSom(){
        return "Chiii";
    }
}
