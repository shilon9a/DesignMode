package Prototype;

import Prototype.Shape.Shape;

public class Main{
    public static void main(String[] args) {
        //模拟某些数据第一次被创建的时候被克隆进缓存
        ShapeCache.loadCache();

        Shape cloneCircle = ShapeCache.getShape(1);
        System.out.println(cloneCircle.getType());

        Shape cloneRectangle = ShapeCache.getShape(2);
        System.out.println(cloneRectangle.getType());
    }
}
