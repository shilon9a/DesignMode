package Memento;

public class Memento extends OriginStatus{

    public Memento(String status) {
        super(status);
        this.status=status;
    }

    public String getStatus(){
        return this.status;
    }

}
