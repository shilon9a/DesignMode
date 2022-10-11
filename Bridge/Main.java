package Bridge;

import Bridge.Draw.impl.GreenCircle;
import Bridge.Draw.impl.RedCircle;
import Bridge.Shape.Shape;
import Bridge.Shape.impl.Circle;

public class Main {
    public static void main(String[] args) {
        Shape redCircle=new Circle(1,2,3,new RedCircle());
        redCircle.draw();
        Shape greenCircle=new Circle(4,5,6,new GreenCircle());
        greenCircle.draw();
    }
}
