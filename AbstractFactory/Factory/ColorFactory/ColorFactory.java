package AbstractFactory.Factory.ColorFactory;


import AbstractFactory.Factory.AbstractFactory;
import AbstractFactory.Factory.COLOR;
import AbstractFactory.Factory.ColorFactory.Color.Color;
import AbstractFactory.Factory.ColorFactory.Color.impl.Blue;
import AbstractFactory.Factory.ColorFactory.Color.impl.Green;
import AbstractFactory.Factory.ColorFactory.Color.impl.Red;
import AbstractFactory.Factory.SHAPE;
import AbstractFactory.Factory.ShapeFactory.Shape.Shape;


public class ColorFactory extends AbstractFactory {


    @Override
    public Color getColor(COLOR color) {
        if(color==COLOR.BLUE){
            return new Blue();
        }else if(color==COLOR.GREEN){
            return new Green();
        } else if (color==COLOR.RED) {
            return new Red();
        }
        else{
            throw new RuntimeException("创建COLOR失败");
        }
    }

    @Override
    public Shape getShape(SHAPE shape) {
        return null;
    }
}
