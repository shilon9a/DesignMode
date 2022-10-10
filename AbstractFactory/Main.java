package AbstractFactory;

import AbstractFactory.Factory.AbstractFactory;
import AbstractFactory.Factory.COLOR;
import AbstractFactory.Factory.ColorFactory.Color.Color;
import AbstractFactory.Factory.ColorFactory.Color.impl.Blue;
import AbstractFactory.Factory.ColorFactory.ColorFactory;
import AbstractFactory.Factory.SHAPE;
import AbstractFactory.Factory.ShapeFactory.Shape.Shape;
import AbstractFactory.Factory.ShapeFactory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ColorFactory color =(ColorFactory)FactoryProducer.getFactory("color");
        Color blue = color.getColor(COLOR.BLUE);
        blue.sayColor();

        ShapeFactory shape =(ShapeFactory) FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape(SHAPE.CIRCLE);
        circle.draw();
    }

}

