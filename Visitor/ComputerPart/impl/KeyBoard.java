package Visitor.ComputerPart.impl;

import Visitor.ComputerPart.ComputerPart;
import Visitor.ComputerPartVisitor.ComputerPartVisitor;

public class KeyBoard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
