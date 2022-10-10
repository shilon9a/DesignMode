package Single.SingleObject;

/**
 * 懒汉式线程安全
 */
public class LazySafe {

    private LazySafe(){}

    private static LazySafe lazySafe;

    public static synchronized LazySafe getInstance(){
        if(lazySafe==null){
            lazySafe=new LazySafe();
        }
        return lazySafe;
    }

}
