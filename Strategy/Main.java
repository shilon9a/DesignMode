package Strategy;

import Strategy.strategy.impl.OperatorAdd;
import Strategy.strategy.impl.OperatorDec;
import Strategy.strategy.impl.OperatorMul;

public class Main {
    public static void main(String[] args) {
        Context add=new Context(new OperatorAdd());
        add.exec(1,2);

        Context dec=new Context(new OperatorDec());
        dec.exec(1,2);

        Context mul=new Context(new OperatorMul());
        mul.exec(1,2);
    }
}
