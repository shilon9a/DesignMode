package Single.SingleObject;

/**
 * 登记式/静态内部类
 */
public class SingletonHolder {

    private SingletonHolder(){}

    private static class Singleton{
        private static final SingletonHolder singletonHolder=new SingletonHolder();
    }

    public static SingletonHolder getInstance(){
        return Singleton.singletonHolder;
    }
}
