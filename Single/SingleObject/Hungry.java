package Single.SingleObject;

/**
 * 饿汉式
 */
public class Hungry {

    private Hungry(){}

    private static Hungry hungry=new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
