package Observer;

public class OctalOberve extends Observe{
    @Override
    public void update() {
        System.out.println("OctalObserve:"+Integer.toOctalString(subject.getStatus()));
    }
}
