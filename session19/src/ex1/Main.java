package ex1;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(5, 10);
        Rectangle rectangle3 = new Rectangle(7, 12);

        System.out.println("Rectangle1 equals rectangle2: " + rectangle1.equals(rectangle2));
        System.out.println("Rectangle1 equals rectangle3: " + rectangle1.equals(rectangle3));

        System.out.println("Hashcode of rectangle1: " + rectangle1.hashCode());
        System.out.println("Hashcode of rectangle2: " + rectangle2.hashCode());
    }
}
