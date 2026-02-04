public class Pizza extends Salgado{
    private boolean rodizio;
    public Pizza(String tamanho, String sabor, double preco, boolean rodizio){
        super(tamanho, sabor, preco);
        this.rodizio = rodizio;
    }
}