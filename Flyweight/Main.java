package Flyweight;

import Flyweight.Shape.Shape;

public class Main {
    public static void main(String[] args) {
        String[] colors=new String[]{"red","Green","yellow","blue","black","white"};

        for(String color:colors){
            Shape circleColor = ShapeFactory.getShape(color);
            circleColor.draw();
        }
    }
}
