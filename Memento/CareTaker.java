package Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
    private final Stack<Memento> mementos=new Stack<>();

    public void push(Memento memento){
        mementos.push(memento);
    }

    public Memento pop(){
        return mementos.pop();
    }

    public int getStatusLen(){
        return mementos.size();
    }

}
