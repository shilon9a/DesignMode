package Single.SingleObject;

/**
 * 双重校验锁
 */
public class DoubleCheckedLocking {

    private DoubleCheckedLocking(){}

    private static volatile DoubleCheckedLocking doubleCheckedLocking;

    public static DoubleCheckedLocking getInstance(){
        if(doubleCheckedLocking==null){
            synchronized(DoubleCheckedLocking.class){
                if(doubleCheckedLocking==null){
                    doubleCheckedLocking=new DoubleCheckedLocking();
                }
            }
        }
        return doubleCheckedLocking;
    }

}
