package Proxy;

import Proxy.Calculate.Calculate;
import Proxy.Calculate.impl.CalculateImplProxy;

public class Main {
    public static void main(String[] args) {
        Calculate calculate=new CalculateImplProxy();
        calculate.plus(1,3);
    }
}
