package shape.areas;

public class Main {

    public static void main(String[] args) {

        double r = 4.0;
        Circle circle = new Circle(r) {
            @Override
            double rectangleArea() {
                return 0;
            }

            @Override
            double squareArea() {
                return 0;
            }
        };
        double l = 3.0;
        Rectangle rectangle = new Rectangle(l) {
            @Override
            double squareArea() {
                return 0;
            }

            @Override
            double circleArea() {
                return 0;
            }
        };
        double s = 1.5;
        Square square = new Square(s) {
            @Override
            double rectangleArea() {
                return 0;
            }

            @Override
            double circleArea() {
                return 0;
            }
        };

        System.out.println("Radius of the circle: " + r);
        System.out.println("Area of the circle: " + circle.circleArea());
        System.out.println("\nLength of the rectangle: " + l);
        System.out.println("Area of the rectangle: " + rectangle.rectangleArea());
        System.out.println("\nSide of the square: " + s);
        System.out.println("Area of the square: " + square.squareArea());
    }
}
