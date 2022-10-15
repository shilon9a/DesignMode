package Proxy.Calculate.impl;

import Proxy.Calculate.Calculate;

public class CalculateImplProxy implements Calculate {

    CalculateImpl calculate=new CalculateImpl();

    @Override
    public void plus(int x, int y) {
        System.out.println("这里是新添加的功能");
        calculate.plus(x,y);
        System.out.println("这里是新添加的功能");
    }
}
