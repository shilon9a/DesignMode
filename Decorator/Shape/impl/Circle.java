package Decorator.Shape.impl;

import Decorator.Shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Circle");
    }
}
