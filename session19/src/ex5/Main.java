package ex5;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, "12345");
        Product product2 = new Product("Phone", 599.99, "12345");
        Product product3 = new Product("Tablet", 299.99, "67890");

        System.out.println("Product1 equals product2: " + product1.equals(product2));
        System.out.println("Product1 equals product3: " + product1.equals(product3));

        System.out.println("Hashcode of product1: " + product1.hashCode());
        System.out.println("Hashcode of product2: " + product2.hashCode());

        product2 = new Product("Phone", 599.99, "54321");

        System.out.println("Product2 with new id equals product1: " + product1.equals(product2));
        System.out.println("Hashcode of product2 with new id: " + product2.hashCode());
    }
}
