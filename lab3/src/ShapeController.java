import shapes.*;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeController {
    private Shape[] shapes;
    private ShapeView view;

    public ShapeController(Shape[] shapes, ShapeView view) {
        this.shapes = shapes;
        this.view = view;
    }

    public void displayShapes() {
        view.displayShapes(shapes);
    }

    public void calculateAndDisplayTotalArea() {
        double totalArea = Arrays.stream(shapes).mapToDouble(Shape::calcArea).sum();
        view.displayTotalArea(totalArea);
    }

    public void calculateAndDisplayTotalAreaByClass (Class<?> shapeType) {
        double totalArea = Arrays.stream(shapes)
                .filter(shape -> shape.getClass().equals(shapeType))
                .mapToDouble(Shape::calcArea).sum();
        view.displayTotalAreaByType(shapeType, totalArea);
    }

    public void displayShapesByArea() {
        Arrays.sort(shapes, Comparator.comparingDouble(Shape::calcArea));
        view.displaySortedByArea(shapes);
    }

    public void displayShapesByColor() {
        Arrays.sort(shapes, Comparator.comparing(Shape::getShapeColor));
        view.displaySortedByColor(shapes);
    }
}
