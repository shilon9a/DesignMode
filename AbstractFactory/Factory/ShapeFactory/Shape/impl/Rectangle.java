package AbstractFactory.Factory.ShapeFactory.Shape.impl;


import AbstractFactory.Factory.ShapeFactory.Shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Rectangle");
    }
}
