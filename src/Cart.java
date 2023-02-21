import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<OrderDetails> items;
    private double totalCost;

    public List<OrderDetails> getItems() {
        return items;
    }

    public Cart() {
        items = new ArrayList<OrderDetails>();
        totalCost = 0;
    }

    public void add(Product p, int quantity){
        OrderDetails item = new OrderDetails(p, quantity);
        items.add(item);
        totalCost += item.getPrice();
    }

    public void remove(OrderDetails item){
        items.remove(item);
        totalCost -= item.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }

    // Checkout
    public Order getOrder(){
        return new Order(items, totalCost);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                ", totalCost=" + totalCost +
                '}';
    }
}
