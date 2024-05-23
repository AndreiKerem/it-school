package shape.areas;

abstract class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double circleArea() {
        return Math.PI * radius * radius;
    }
}
