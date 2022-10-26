package Visitor.ComputerPartVisitor;

import Visitor.ComputerPart.ComputerPart;

public interface ComputerPartVisitor {
    void visit(ComputerPart computerPart);
}
