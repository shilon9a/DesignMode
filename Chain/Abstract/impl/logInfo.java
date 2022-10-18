package Chain.Abstract.impl;

import Chain.Abstract.AbstractLogger;

import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class logInfo extends AbstractLogger {

    public logInfo(){
        this.nextLogger=new logDebug();
    }
    @Override
    public void write(String msg){
        System.out.println(Thread.currentThread().getName()+"：this is log Info："+msg);
    }
}
