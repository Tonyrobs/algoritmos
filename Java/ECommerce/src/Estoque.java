import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Livro> listaLivros;
    private String status;
    private int capacidade;

    public Estoque(int capacidade) {
        this.listaLivros = new ArrayList<>();
        this.capacidade = capacidade;
        verificarStatus();
    }

    public void adicionarLivro(Livro livro) {
        if (listaLivros.size() < capacidade) {
            listaLivros.add(livro);
            System.out.println("Livro " + livro.getTitulo() + " adicionado ao estoque.");
            verificarStatus();
        } else {
            System.out.println("Estoque cheio! Não é possível adicionar mais livros.");
        }
    }

    public void removerLivro(String isbn) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getIsbn().equals(isbn)) {
                System.out.println("Livro '" + listaLivros.get(i).getTitulo() + "' removido do estoque.");
                listaLivros.remove(i);
                verificarStatus();
                return;
            }
        }
        System.out.println("Livro com ISBN '" + isbn + "' não encontrado no estoque.");
    }

    public Livro pesquisarLivroPorTitulo(String titulo) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
    public Livro pesquisarLivroPorIsbn(String isbn) {
        for (Livro livro : listaLivros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public void verificarStatus() {
        if (listaLivros.size() == 0) {
            this.status = "Vazio";
        } else if (listaLivros.size() < capacidade) {
            this.status = "Disponível (" + (capacidade - listaLivros.size()) + " vagas)";
        } else {
            this.status = "Cheio";
        }
    }

    public void exibirLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }
        System.out.println("\nLivros no Estoque");
        for (Livro livro : listaLivros) {
            livro.exibirInfo();
        }
        System.out.println();
        System.out.println("Status do Estoque: " + status);
    }
}