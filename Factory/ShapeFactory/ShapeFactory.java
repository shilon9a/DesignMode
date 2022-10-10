package Factory.ShapeFactory;

import Factory.ShapeFactory.Shape.Shape;
import Factory.ShapeFactory.Shape.ShapeImpl.Circle;
import Factory.ShapeFactory.Shape.ShapeImpl.Rectangle;
import Factory.ShapeFactory.Shape.ShapeImpl.Square;

enum SHAPE{
    CIRCLE,
    RECTANGLE,
    SQUARE
}

public class ShapeFactory {

    public static SHAPE CIRCLE=SHAPE.CIRCLE;
    public static SHAPE RECTANGLE=SHAPE.RECTANGLE;
    public static SHAPE SQUARE=SHAPE.SQUARE;



    public static Shape getShape(SHAPE shape){
        if(shape==SHAPE.CIRCLE){
            return new Circle();
        }
        else if(shape==SHAPE.RECTANGLE){
            return new Rectangle();
        }
        else if (shape==SHAPE.SQUARE){
            return new Square();
        }
        else{
            throw new RuntimeException("创建失败");
        }
    }

}
