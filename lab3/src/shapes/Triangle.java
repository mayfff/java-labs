package shapes;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(String shapeColor, double base, double height) {
        super(shapeColor);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public String toString() {
        return "Triangle: [base=" + base + ", height=" + height + ", " + super.toString() + "]";
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
