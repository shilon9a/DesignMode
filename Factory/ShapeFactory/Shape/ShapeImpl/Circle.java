package Factory.ShapeFactory.Shape.ShapeImpl;


import Factory.ShapeFactory.Shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Circle");
    }

}
