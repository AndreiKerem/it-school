package online.shopping.system;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Vlada Andrei", "andres.stan69@gmail.com", "Strada Fainari 3", "Strada Episcopul Radu 57");

        Product product1 = new Product("Laptop", "Brand new laptop", 999.99, 10);
        Product product2 = new Product("Mouse", "Wireless mouse", 19.99, 20);

        customer1.addToCart(product1);
        customer1.addToCart(product2);

        customer1.placeOrder();

        System.out.println(" Order History: ");
        customer1.viewOrderHistory();

        Payment payment1 = new Payment("Credit Card", 1019.98);
        payment1.processPayment();

        System.out.println(" Payment Information ");
        payment1.displayPayment();
    }
}
