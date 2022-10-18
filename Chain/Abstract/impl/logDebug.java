package Chain.Abstract.impl;

import Chain.Abstract.AbstractLogger;

public class logDebug extends AbstractLogger {

    public logDebug(){
        this.nextLogger=new logError();
    }

    @Override
    public void write(String msg) {
        System.out.println(Thread.currentThread().getName()+"：this is log Debug："+msg);
    }
}
