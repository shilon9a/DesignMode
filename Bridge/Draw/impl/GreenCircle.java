package Bridge.Draw.impl;

import Bridge.Draw.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("this is GreenCircle , Radius: "+ radius +"x: "+x+" y: "+y);
    }
}
