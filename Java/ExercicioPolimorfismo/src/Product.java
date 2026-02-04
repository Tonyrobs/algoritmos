public class Product {
    private String name;
    private double price;

    public Product(){

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String priceTag(){
        return name + String.format(" R$ %.2f", price);
    }
}
