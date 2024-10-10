package shapes;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle: [width=" + width + ", height=" + height + ", " + super.toString() + "]";
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
