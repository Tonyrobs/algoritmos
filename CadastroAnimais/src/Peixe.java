public class Peixe extends Animal {
    public Peixe(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }
    @Override
    public String fazerSom(){
        return "Glub glub";
    }
}
