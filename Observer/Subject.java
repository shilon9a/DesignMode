package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observe> observerList=new ArrayList<>();

    private int status;

    public int getStatus(){
        return this.status;
    }

    public void setStatus(int status){
        this.status=status;
        notifyAllObserve();
    }

    public void attach(Observe observe){
        observerList.add(observe);
    }

    public void notifyAllObserve(){
        for(Observe observe:observerList){
            observe.update();
        }
    }

}
