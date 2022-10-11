package Bridge.Shape;

import Bridge.Draw.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }

    public abstract void draw();
}
