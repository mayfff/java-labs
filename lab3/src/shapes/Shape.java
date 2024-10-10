package shapes;

public abstract class Shape implements Drawable {
    private final String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "shape color: " + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }
}
