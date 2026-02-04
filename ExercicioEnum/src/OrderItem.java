public class OrderItem {
    private int quantidade;
    private double preco;

    private Product product;

    public OrderItem(int quantidade, double preco, Product product) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.product = product;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public Product getProduct() {
        return product;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double subTotal(){
        return preco * quantidade;
    }

}
