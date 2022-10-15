package Flyweight.Shape.impl;

import Flyweight.Shape.Shape;

public class Circle implements Shape {
    private double radius;
    private double x;
    private double y;
    private String color;

    public Circle(String color){
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}');
    }
}
