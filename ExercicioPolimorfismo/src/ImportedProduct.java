public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    @Override
    public String priceTag (){
        return getName() + String.format(" R$ %.2f", totalPrice()) +
                " (Customs fee: R$ " + String.format("%.2f ", customsFee) + ")" ;
    }
    public double totalPrice(){
        double soma = customsFee + getPrice();
        return soma;
    }
}
