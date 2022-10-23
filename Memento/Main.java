package Memento;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();

        OriginStatus status=new OriginStatus("#Status1");
        status.PreStatus();
        status=new OriginStatus("#status2");
        status.PreStatus();
        status=new OriginStatus("#status3");
        status.PreStatus();
        status=new OriginStatus("#status4");
        status.PreStatus();

        for(int i=0;i< careTaker.getStatusLen();i++){
            OriginStatus originStatus=status.PopStatus();
            originStatus.status();
        }

    }
}
