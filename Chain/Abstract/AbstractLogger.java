package Chain.Abstract;

import Proxy.Calculate.Calculate;

import java.util.Calendar;

public abstract class AbstractLogger {

    public AbstractLogger nextLogger;

    //我认为责任链中的链不应该由用户去设计，这应该由实现者去设计
    /*public void setNextLogger(AbstractLogger abstractLogger){
        this.nextLogger=abstractLogger;
    }*/

    public void logMsg(String msg){
        if(msg!=null){
            write(msg);
        }
        if(nextLogger!=null){
            nextLogger.logMsg(msg);
        }
    }

    public abstract void write(String msg);


    public void Time(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }


}
