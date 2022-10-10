package Single.SingleObject;

/**
 * 单例模式的简单实现
 */
public class SingleObject {

    //首先将构造函数私有化，这样外界就不能通过构造函数来获取当前类的实例
    private SingleObject(){}

    //创建当前类唯一的一个实例对象
    private static SingleObject singleObject=new SingleObject();

    //创建静态方法暴露给外界，提供当前类唯一静态实例
    public static SingleObject getInstance(){
        return singleObject;
    }

    //测试方法，测试方法使用非静态的，这样才能测试当前类的实例是否获取成功
    //因为非静态方法只有实例才能调用
    public void sayHello(){
        System.out.println("hello");
    }

}
