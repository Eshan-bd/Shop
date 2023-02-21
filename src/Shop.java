public class Shop {
    public static void main(String[] args) {
        Customer karim= new Customer("karim16", "1234", "Abdul Karim", "karim7@gmail.com");
        karim.login();

        Product shampoo, coke;
        shampoo = new Product("Head & Shoulders 300ml", "No more dandruff", 550);
        coke = new Product("Coca Cola 1.25L", "Delicious and refreshing", 75);

        Cart shoppingCart = new Cart();
        shoppingCart.add(shampoo, 3);
        shoppingCart.add(coke, 7);

        System.out.println(shoppingCart);

        Order order = shoppingCart.getOrder();
        order.setAddress("Mirpur");
        System.out.println(order);
    }
}
