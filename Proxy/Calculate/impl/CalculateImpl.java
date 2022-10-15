package Proxy.Calculate.impl;

import Proxy.Calculate.Calculate;

public class CalculateImpl implements Calculate {
    @Override
    public void plus(int x, int y) {
        System.out.println("x+"+"y="+(x+y));
    }
}
