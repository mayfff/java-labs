import shapes.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
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

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("shapes.txt"))) {
            for (Shape shape : shapes) {
                oos.writeObject(shape);
            }
        }

        Shape[] shapes2 = new Shape[10];
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("shapes.txt"))) {
            for (int i = 0; i < shapes2.length; i++) {
                shapes2[i] = (Shape) ois.readObject();
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController(shapes2, view);

        controller.displayShapes();
        controller.calculateAndDisplayTotalArea();
        controller.calculateAndDisplayTotalAreaByClass("Circle");
        controller.displayShapesByArea();
        controller.displayShapesByColor();
    }
}