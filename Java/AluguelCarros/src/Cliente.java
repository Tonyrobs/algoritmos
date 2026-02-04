public class Cliente {
    private String nome;
    private int idade;
    private String cnh;

    public Cliente(String nome, int idade, String cnh) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCnh() {
        return cnh;
    }

    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nNúmero da CNH: " + cnh;
    }
}
