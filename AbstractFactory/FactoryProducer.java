package AbstractFactory;

import AbstractFactory.Factory.AbstractFactory;
import AbstractFactory.Factory.ColorFactory.ColorFactory;
import AbstractFactory.Factory.ShapeFactory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String name){
        if(name.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        } else if (name.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        else{
            throw new RuntimeException("工厂对象创建失败");
        }
    }
}
