package Visitor.ComputerPart;

import Visitor.ComputerPartVisitor.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
