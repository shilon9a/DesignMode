package Prototype.Shape;

public class Square extends Shape{

    public Square(){
        type="Square";
    }

    @Override
    public void draw() {
        System.out.println("this is Square");
    }

    @Override
    public Integer getId() {
        return id;
    }
}
