package Prototype.Shape;

public class Circle extends Shape{

    public Circle(){
        type="Circle";
    }

    @Override
    public void draw() {
        System.out.println("this is Circle");
    }

    @Override
    public Integer getId() {
        return id;
    }
}
