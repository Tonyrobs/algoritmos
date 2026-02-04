import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Livro> listaLivros;
    private double valorTotal;

    public Carrinho() {
        this.listaLivros = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
        valorTotal += livro.getPreco();
        System.out.println("Livro " + livro.getTitulo() + " adicionado ao carrinho.");
    }

    public void removerLivro(String isbn) {
        Livro livroParaRemover = null;
        for (Livro livro : listaLivros) {
            if (livro.getIsbn().equals(isbn)) {
                livroParaRemover = livro;
                break;
            }
        }
        if (livroParaRemover != null) {
            listaLivros.remove(livroParaRemover);
            valorTotal -= livroParaRemover.getPreco();
            System.out.println("Livro com ISBN '" + isbn + "' removido do carrinho.");
        } else {
            System.out.println("Livro com ISBN '" + isbn + "' não encontrado no carrinho.");
        }
    }

    public void pagar() {
        if (listaLivros.isEmpty()) {
            System.out.println("Seu carrinho está vazio. Não há nada para pagar.");
        } else {
            System.out.println("\nProcessando pagamento...");
            System.out.println("Valor total: R$" + String.format("%.2f", valorTotal));
            System.out.println("Pagamento realizado com sucesso!");
            listaLivros.clear();
            valorTotal = 0.0;
        }
    }

    public void exibirCarrinho() {
        if (listaLivros.isEmpty()) {
            System.out.println("Seu carrinho de compras está vazio.");
            return;
        }
        System.out.println("\nItens no Carrinho");
        for (Livro livro : listaLivros) {
            livro.exibirInfo();
        }
        System.out.println("\nValor Total: R$" + String.format("%.2f", valorTotal));
        System.out.println();
    }
}