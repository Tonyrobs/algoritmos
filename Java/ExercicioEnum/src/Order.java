import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderList = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderList() {
        return orderList;
    }

    public void addItem(OrderItem item){
        orderList.add(item);
    }
    public void removeItem(OrderItem item){
        orderList.remove(item);
    }
    public double total(){
        double soma = 0;
        for(OrderItem i : orderList){
            soma += i.subTotal();
        }
        return soma;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        for(OrderItem i : orderList){
            sb.append(i.getProduct().getNome() + ", Quantidade: " + i.getQuantidade() + ", subtotal: R$ " +
                    String.format("%.2f", i.subTotal()));
            sb.append("\n");
        }
        return sb.toString();
    }
}
