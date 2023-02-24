import java.util.List;

public class Order {
    private final double totalCost;
    private final List<OrderDetails> items;
    private String address;
    private static double vat = 0.07;

    public Order(List<OrderDetails> items, double totalCost) {
        this.items = items;
        this.totalCost = totalCost + vat*totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public List<OrderDetails> getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "totalCost=" + totalCost +
                ", items=" + items +
                ", address='" + address + '\'' +
                '}';
    }

    public static double getVat() {
        return vat;
    }

    public static void setVat(double v) {
        vat = v;
    }
}
