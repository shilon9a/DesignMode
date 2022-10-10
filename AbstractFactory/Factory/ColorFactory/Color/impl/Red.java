package AbstractFactory.Factory.ColorFactory.Color.impl;

import AbstractFactory.Factory.ColorFactory.Color.Color;

public class Red implements Color {
    @Override
    public void sayColor() {
        System.out.println("this is red");
    }
}
