import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private List<Aparelho> aparelhos = new ArrayList<>();

    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<Aparelho> getAparelhos() { return aparelhos; }
    public void adicionarAparelho(Aparelho aparelho){ this.aparelhos.add(aparelho); }

    public static Cliente cadastrarCliente(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Telefone celular: ");
        String telefone = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();

        System.out.println("Cliente cadastrado com sucesso! ");

        return new Cliente(nome, cpf, telefone, email);
    }

    public void editarCliente(Scanner sc) {
        System.out.print("Novo nome (" + this.nome + "): ");
        String novoNome = sc.nextLine();
        if (!novoNome.isEmpty()) this.nome = novoNome;

        System.out.print("Novo telefone (" + this.telefone + "): ");
        String novoTel = sc.nextLine();
        if (!novoTel.isEmpty()) this.telefone = novoTel;

        System.out.print("Novo e-mail (" + this.email + "): ");
        String novoEmail = sc.nextLine();
        if (!novoEmail.isEmpty()) this.email = novoEmail;

        System.out.println("Cliente editado com sucesso.");
    }

    public void removeCliente(List<Cliente> clientes) {
        clientes.remove(this);
        System.out.println("Cliente " + this.nome + " removido.");
    }

}