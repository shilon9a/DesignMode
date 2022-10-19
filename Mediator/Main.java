package Mediator;

public class Main {
    public static void main(String[] args) {
        User zhangsan=new User("zhangsan");
        zhangsan.SendMsg("我是张三");
        User lisi=new User("lisi");
        lisi.SendMsg("我是里斯");
    }
}
