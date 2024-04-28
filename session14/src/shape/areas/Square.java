package shape.areas;

public abstract class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double squareArea() {
        return side * side;
    }
}
