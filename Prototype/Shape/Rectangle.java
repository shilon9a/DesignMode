package Prototype.Shape;

public class Rectangle extends Shape{

    public Rectangle(){
        type="Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("this is Rectangle");
    }

    @Override
    public Integer getId() {
        return id;
    }
}
