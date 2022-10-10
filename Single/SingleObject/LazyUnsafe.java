package Single.SingleObject;

/**
 * 懒汉式（线程不安全）
 */
public class LazyUnsafe {

    private LazyUnsafe(){}

    private static LazyUnsafe lazyUnsafe;

    public static LazyUnsafe getInstance(){
        if(lazyUnsafe==null){
            lazyUnsafe=new LazyUnsafe();
        }
        return lazyUnsafe;
    }
}
