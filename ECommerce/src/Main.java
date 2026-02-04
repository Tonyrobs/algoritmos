import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque(50); // Capacidade do estoque
        Usuario usuario = null;
        Carrinho carrinho = new Carrinho();

        int opcao = -1;

        // Adicionar alguns livros de exemplo ao estoque
        estoque.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "Aventuras épicas na Terra-média.", 1200, "Fantasia", 85.50, "978-0-618-05326-7", "Capa Dura"));
        estoque.adicionarLivro(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "A jornada de um jovem bruxo.", 300, "Fantasia", 59.90, "978-85-325-1101-0", "Brochura"));
        estoque.adicionarLivro(new Livro("1984", "George Orwell", "Distopia sobre controle e vigilância.", 328, "Ficção Científica", 45.00, "978-85-359-1484-9", "Brochura"));

        if (usuario == null) {
            System.out.println("\nVocê precisa se cadastrar para continuar.");
            System.out.print("Digite seu nome completo: ");
            String nome = sc.nextLine();
            System.out.print("Digite sua idade: ");
            Integer idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite seu e-mail: ");
            String email = sc.nextLine();
            System.out.print("Digite seu endereço: ");
            String endereco = sc.nextLine();
            usuario = new Usuario(nome, idade, email, endereco);
            System.out.println("\nUsuário cadastrado com sucesso!");
        }

        while (opcao != 0) {
            System.out.println("\nMenu Principal");
            System.out.println("(1) - Ver Livros em Estoque");
            System.out.println("(2) - Pesquisar Livro");
            System.out.println("(3) - Adicionar Livro ao Carrinho");
            System.out.println("(4) - Ver Carrinho");
            System.out.println("(5) - Finalizar Compra");
            System.out.println("(6) - Gerenciar Usuário");
            System.out.println("(0) - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    estoque.exibirLivros();
                    break;
                case 2:
                    System.out.println("Pesquisar livro pelo titulo: ");
                    String tituloPesquisa = sc.nextLine();
                    Livro livroEncontrado = estoque.pesquisarLivroPorTitulo(tituloPesquisa);
                    System.out.println("Livro encontrado!");
                    livroEncontrado.exibirInfo();
                    break;
                case 3:
                    System.out.println("ISBN do livro: ");
                    String isbnLivro = sc.nextLine();
                    Livro livroParaAdicionar = estoque.pesquisarLivroPorIsbn(isbnLivro);
                    carrinho.adicionarLivro(livroParaAdicionar);
                    System.out.println("Livro com ISBN " + isbnLivro + " adicionado ou nao encontrado.");
                    break;
                case 4:
                    carrinho.exibirCarrinho();
                    break;
                case 5:
                    carrinho.pagar();
                    break;
                case 6:
                    usuario.exibirInfo();
                    break;
                case 0:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Opcao errada.");
            }
        }
        sc.close();
    }
}