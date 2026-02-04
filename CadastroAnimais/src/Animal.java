import javax.swing.JOptionPane;

public abstract class Animal {
    private String nome;
    private String tipo;
    private int idade; // Atributo mantido

    // CONSTRUTOR ATUALIZADO: Inclui a idade como 3º argumento
    public Animal(String nome, String tipo, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    public abstract String fazerSom();

    // O resto da sua classe está perfeito
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }

    @Override
    public String toString() {
        return this.tipo + " - Nome: " + this.nome + ", Idade: " + this.idade;
    }
    public String exibirInformacoes() {
        return this.toString();
    }
    public String exibirInformacoes(boolean comSom) {
        if (comSom) {
            return this.toString() + ", Som: " + this.fazerSom();
        }
        return this.toString();
    }
}