package shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public String toString() {
        return "Circle: [radius=" + radius + ", " + super.toString() + "]";
    }

    public double getRadius() {
        return radius;
    }
}
