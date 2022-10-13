package Decorator.Shape.impl;

import Decorator.Shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Rectangle");
    }
}
