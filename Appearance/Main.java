package Appearance;

import Appearance.Shape.impl.Rectangle;
import Appearance.Shape.impl.Square;
import Decorator.Shape.impl.Circle;

public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker(new Circle(),new Square(),new Rectangle());

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
