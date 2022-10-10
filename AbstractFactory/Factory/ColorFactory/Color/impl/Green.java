package AbstractFactory.Factory.ColorFactory.Color.impl;

import AbstractFactory.Factory.ColorFactory.Color.Color;

public class Green implements Color {
    @Override
    public void sayColor() {
        System.out.println("this is green");
    }
}
