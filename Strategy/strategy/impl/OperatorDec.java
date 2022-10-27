package Strategy.strategy.impl;

import Strategy.strategy.Strategy;

public class OperatorDec implements Strategy {
    @Override
    public void doOperator(int num1, int num2) {
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }
}
