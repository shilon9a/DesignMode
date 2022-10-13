package Appearance;

import Appearance.Shape.impl.Rectangle;
import Appearance.Shape.impl.Square;
import Decorator.Shape.impl.Circle;

public class ShapeMaker {
    private Circle circle;
    private Square square;
    private Rectangle rectangle;

    public ShapeMaker(Circle circle,Square square,Rectangle rectangle){
        this.circle=circle;
        this.square=square;
        this.rectangle=rectangle;
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
