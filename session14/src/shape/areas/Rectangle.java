package shape.areas;

abstract class Rectangle extends Shape{

    private double length;

    public Rectangle(double length) {
        this.length = length;
    }

    @Override
    double rectangleArea() {
        return length * length;
    }
}
