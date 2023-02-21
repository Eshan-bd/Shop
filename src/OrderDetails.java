public class OrderDetails {
    private final Product item;
    private int quantity;

    public OrderDetails(Product item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice(){
        return item.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "{" +
                "item=" + item.getName() +
                ", quantity=" + quantity +
                '}';
    }
}
