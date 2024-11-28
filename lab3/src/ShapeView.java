import shapes.*;

public class ShapeView {
    public void displayShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("\n");
    }

    public void displayTotalArea(double area) {
        System.out.println("Total area: " + area);
        System.out.println("\n");
    }

    public void displayTotalAreaByType(String shapeType, double totalArea) {
        System.out.println("Total area for " + shapeType + "s is: " + totalArea);
        System.out.println("\n");
    }

    public void displaySortedByArea(Shape[] shapes) {
        System.out.println("Shapes sorted by area:");
        for (Shape shape : shapes) {
            System.out.println(shape + " area: " + shape.calcArea());
        }
        System.out.println("\n");
    }

    public void displaySortedByColor(Shape[] shapes) {
        System.out.println("Shapes sorted by color:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("\n");
    }
}
