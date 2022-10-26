package Visitor.ComputerPart.impl;

import Visitor.ComputerPart.ComputerPart;
import Visitor.ComputerPartVisitor.ComputerPartVisitor;

public class Computer implements ComputerPart {
    ComputerPart[] computerParts;
    public Computer(){
        computerParts=new ComputerPart[]{new KeyBoard(),new Monitor(),new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart computerPart:computerParts){
            computerPart.accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}
