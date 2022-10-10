package AbstractFactory.Factory.ColorFactory.Color.impl;

import AbstractFactory.Factory.ColorFactory.Color.Color;

public class Blue implements Color {
    @Override
    public void sayColor() {
        System.out.println("this is blue");
    }
}
