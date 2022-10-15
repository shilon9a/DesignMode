package Flyweight;

import Flyweight.Shape.Shape;
import Flyweight.Shape.impl.Circle;

import java.util.HashMap;

public class ShapeFactory {
    //缓冲池
    private static final HashMap<String, Shape> shapeMap=new HashMap<>();

    public static Shape getShape(String color){
        Shape shape=shapeMap.get(color);
        if(shape==null){
            shapeMap.put(color,new Circle(color));
            return (Shape)shapeMap.get(color);
        }
        return shape;

    }

}
