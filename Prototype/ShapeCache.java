package Prototype;

import Prototype.Shape.Circle;
import Prototype.Shape.Rectangle;
import Prototype.Shape.Shape;
import Prototype.Shape.Square;

import java.util.Hashtable;

public class ShapeCache {

    //维护着一个hashTable，里面存储着大量的实例，当作缓存
    //因为这些实例创建的时候需要消耗大量的资源
    //所以在其创建的时候我们就将其克隆放入缓存中，当被该实例被需要的时候，就从这里抛出去给请求使用
    private static Hashtable<Integer, Shape> shapeHashtable=new Hashtable<>();

    public static Shape getShape(Integer shapeId){
        return shapeHashtable.get(shapeId);
    }

    //初始化缓存的数据
    public static void loadCache(){
        Circle circle=new Circle();
        circle.setId(1);

        Rectangle rectangle=new Rectangle();
        rectangle.setId(2);

        Square square=new Square();
        square.setId(3);

        shapeHashtable.put(circle.getId(), circle);
        shapeHashtable.put(rectangle.getId(), rectangle);
        shapeHashtable.put(square.getId(), square);
    }

}
