import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private String descricao;
    private Integer numPaginas;
    private String categoria;
    private Double preco;
    private String isbn;
    private String formato;

    public Livro(String titulo, String autor, String descricao, Integer numPaginas, String categoria, Double preco, String isbn, String formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.numPaginas = numPaginas;
        this.categoria = categoria;
        this.preco = preco;
        this.isbn = isbn;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void cadastrarLivros(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        titulo = sc.nextLine();
        System.out.println("Digite o autor do livro: ");
        autor = sc.nextLine();
        System.out.println("Digite o descricao do livro: ");
        descricao = sc.nextLine();
        System.out.println("Digite o número de páginas do livro: ");
        numPaginas = sc.nextInt();
        System.out.println("Digite a categoria do livro: ");
        categoria = sc.nextLine();
        System.out.println("Digite o preço do livro: ");
        preco = sc.nextDouble();
        System.out.println("Digite o ISBN do livro: ");
        isbn = sc.nextLine();
        System.out.println("Digite o formato do livro: ");
        formato = sc.nextLine();
    }
    public void gerenciarLivros(){
        System.out.println("Digite a opção referente ao número: ");
        System.out.println("(1) - Remover livro");
        System.out.println("(2) - Editar livro");
        System.out.println("(0) - Sair");
    }
    public void pesquisarLivros(){

    }

    public void exibirInfo() {
        System.out.println("\nDados do Livro");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + preco);
        System.out.println("ISBN: " + isbn);
        System.out.println("");
    }

}
