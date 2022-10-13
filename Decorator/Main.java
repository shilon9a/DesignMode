package Decorator;


import Decorator.Shape.Shape;
import Decorator.Shape.impl.Circle;
import Decorator.Shape.impl.Rectangle;
import Decorator.ShapeDecorator.ShapeDecorator;
import Decorator.ShapeDecorator.impl.RedShapeDecorator;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape recTangle=new Rectangle();

        ShapeDecorator circleDecorator=new RedShapeDecorator(circle);
        circleDecorator.draw();

        ShapeDecorator recTangleDecorator=new RedShapeDecorator(recTangle);
        recTangleDecorator.draw();


    }
}
