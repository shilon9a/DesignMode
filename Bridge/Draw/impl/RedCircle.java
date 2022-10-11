package Bridge.Draw.impl;

import Bridge.Draw.DrawAPI;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("this is RedCircle , Radius: "+ radius +"x: "+x+" y: "+y);
    }
}
