package online.shopping.system;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String email;
    private String shippingAddress;

    private String billingAddress;
    private List<Product> shoppingCart = new ArrayList<>();
    private List<Order> orderHistory = new ArrayList<>();


    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public void placeOrder() {
        Order order = new Order(this, shoppingCart);
        orderHistory.add(order);
        shoppingCart.clear();
    }

    public void viewOrderHistory() {
        for (Order order : orderHistory) {
            order.displayOrder();
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }
}
