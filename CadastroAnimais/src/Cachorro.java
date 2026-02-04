public class Cachorro extends Animal {

    // Construtor agora recebe 3 argumentos, chamando o super(3 args)
    public Cachorro(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }

    @Override
    public String fazerSom() {
        return "Au Au!";
    }
}