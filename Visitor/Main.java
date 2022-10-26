package Visitor;

import Visitor.ComputerPart.ComputerPart;
import Visitor.ComputerPart.impl.Computer;
import Visitor.ComputerPartVisitor.impl.ComputerPartVisitorImpl;

public class Main {
    public static void main(String[] args) {
        ComputerPart computerPart=new Computer();
        computerPart.accept(new ComputerPartVisitorImpl());
        computerPart.getClass();

    }

}
