package Observer;

public abstract class Observe {
    protected Subject subject;

    public void attach(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    public abstract void update();
}
