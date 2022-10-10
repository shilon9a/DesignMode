package AbstractFactory.Factory;


import AbstractFactory.Factory.ColorFactory.Color.Color;
import AbstractFactory.Factory.ShapeFactory.Shape.Shape;


public abstract class AbstractFactory {

    public static COLOR BLUE=COLOR.BLUE;
    public static COLOR RED=COLOR.RED;
    public static COLOR GREEN=COLOR.GREEN;

    public static SHAPE CIRCLE=SHAPE.CIRCLE;
    public static SHAPE RECTANGLE=SHAPE.RECTANGLE;
    public static SHAPE SQUARE=SHAPE.SQUARE;


    public abstract Color getColor(COLOR color);

    public abstract Shape getShape(SHAPE shape);

}
