package Visitor.ComputerPartVisitor.impl;

import Builder.Packing.Pack;
import Visitor.ComputerPart.ComputerPart;
import Visitor.ComputerPart.impl.Computer;
import Visitor.ComputerPart.impl.KeyBoard;
import Visitor.ComputerPart.impl.Monitor;
import Visitor.ComputerPart.impl.Mouse;
import Visitor.ComputerPartVisitor.ComputerPartVisitor;

public class ComputerPartVisitorImpl implements ComputerPartVisitor {
    @Override
    public void visit(ComputerPart computerPart){
        Class clazz=computerPart.getClass();
        if(clazz== KeyBoard.class){
            System.out.println("this is KeyBoard");
        }
        if(clazz == Mouse.class){
            System.out.println("this is Mouse");
        }
        if(clazz== Monitor.class){
            System.out.println("this is Monitor");
        }
        if(clazz== Computer.class){
            System.out.println("this is Computer");
        }

    }
}
