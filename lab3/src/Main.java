import shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Rectangle("Red", 4, 5);
        shapes[1] = new Rectangle("Blue", 6, 7);
        shapes[2] = new Triangle("Green", 4, 3);
        shapes[3] = new Triangle("Yellow", 5, 8);
        shapes[4] = new Circle("Pink", 3);
        shapes[5] = new Circle("Purple", 7);
        shapes[6] = new Rectangle("Orange", 8, 10);
        shapes[7] = new Triangle("Gray", 6, 9);
        shapes[8] = new Circle("Cyan", 5);
        shapes[9] = new Rectangle("White", 2, 3);

        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController(shapes, view);

        controller.displayShapes();
        controller.calculateAndDisplayTotalArea();
        controller.calculateAndDisplayTotalAreaByClass(Circle.class);
        controller.displayShapesByArea();
        controller.displayShapesByColor();
    }
}