package online.shopping.system;

import java.util.List;

public class Order {

    private static int nextOrderNumber = 1;
    private int orderNumber;
    private Customer customer;
    private List<Product> products;
    private String orderStatus;

    public Order(Customer customer, List<Product> products) {
        this.orderNumber = nextOrderNumber++;
        this.customer = customer;
        this.products = products;
        this.orderStatus = " Pending ";
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println(" Order number: " + orderNumber);
        System.out.println(" Customer: " + customer.getName());
        System.out.println(" Total: " + calculateTotal());
        System.out.println(" Order Status: " + orderStatus);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
