package Chain.Abstract.impl;

import Chain.Abstract.AbstractLogger;

public class logError extends AbstractLogger {

    public logError(){
        this.nextLogger=null;
    }

    @Override
    public void write(String msg) {
        System.out.println(Thread.currentThread().getName()+"：this is log Error："+msg);
    }
}
