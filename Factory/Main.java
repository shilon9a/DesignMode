package Factory;

import Factory.ShapeFactory.Shape.Shape;
import Factory.ShapeFactory.ShapeFactory;

public class Main extends ShapeFactory {
    public static void main(String[] args) {
        Shape shape1= ShapeFactory.getShape(ShapeFactory.CIRCLE);
        Shape shape2=ShapeFactory.getShape(ShapeFactory.RECTANGLE);
        Shape shape3=ShapeFactory.getShape(ShapeFactory.SQUARE);

        shape1.draw();
        shape2.draw();
        shape3.draw();

    }
}
