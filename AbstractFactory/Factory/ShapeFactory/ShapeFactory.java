package AbstractFactory.Factory.ShapeFactory;

import AbstractFactory.Factory.AbstractFactory;
import AbstractFactory.Factory.COLOR;
import AbstractFactory.Factory.ColorFactory.Color.Color;
import AbstractFactory.Factory.SHAPE;
import AbstractFactory.Factory.ShapeFactory.Shape.Shape;
import AbstractFactory.Factory.ShapeFactory.Shape.impl.Circle;
import AbstractFactory.Factory.ShapeFactory.Shape.impl.Rectangle;
import AbstractFactory.Factory.ShapeFactory.Shape.impl.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(COLOR color) {
        return null;
    }

    @Override
    public Shape getShape(SHAPE shape) {
        if(shape==SHAPE.CIRCLE){
            return new Circle();
        } else if (shape==SHAPE.RECTANGLE) {
            return new Rectangle();
        } else if (shape==SHAPE.SQUARE) {
            return new Square();
        }
        else {
            throw new RuntimeException("创建SHAPE失败");
        }
    }
}
