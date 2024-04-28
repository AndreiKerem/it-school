package online.shopping.system;


public class Product {

    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println(" Name " + name);
        System.out.println(" Description " + description);
        System.out.println(" Price " + price);
        System.out.println(" Quantity " + quantity);
    }

    public boolean isInStock() {
        return quantity > 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
