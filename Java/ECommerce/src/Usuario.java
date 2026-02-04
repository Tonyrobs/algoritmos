import java.util.Scanner;

public class Usuario {
    private String nome;
    private Integer idade;
    private String email;
    private String endereco;

    public Usuario(String nome, Integer idade, String email, String endereco ) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarUsuario(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu e-mail: ");
        email = sc.nextLine();
        System.out.println("Digite seu endereço de entrega: ");
        endereco = sc.nextLine();
    }

    public void gerenciarUsuario(){
        System.out.println("Digite a opção referente ao número: ");
        System.out.println("(1) - Alterar senha: ");
        System.out.println("(2) - Alterar e-mail: ");
        System.out.println("(3) - Alterar nome de usuário: ");
        System.out.println("(0) - Sair");
    }

    public void exibirInfo() {
        System.out.println("\nDados do Usuário");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
    }

}
 