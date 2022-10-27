package Strategy;

import Strategy.strategy.Strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void exec(int num1,int num2){
        strategy.doOperator(num1,num2);
    }

}
