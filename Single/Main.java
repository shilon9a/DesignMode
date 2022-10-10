package Single;

import Single.SingleObject.SingleObject;

public class Main {
    public static void main(String[] args) {

        //获取唯一静态实例
        SingleObject singleObject=SingleObject.getInstance();

        //调用非静态方法，测试实例是否创建成功
        singleObject.sayHello();
    }
}
