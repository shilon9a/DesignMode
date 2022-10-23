package Memento;

public class OriginStatus {
    protected String status;

    private static final CareTaker careTaker=new CareTaker();

    public OriginStatus(String status){
        this.status=status;
    }

    public void PreStatus(){
        careTaker.push(new Memento(this.status));
    }

    public Memento PopStatus(){
        return careTaker.pop();
    }

    public void status(){
        System.out.println("this is :"+status);
    }

}
