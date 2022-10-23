package Observer;

public class HexaObserve extends Observe{
    @Override
    public void update() {
        System.out.println("HexaObserve:"+Integer.toHexString(subject.getStatus()));
    }
}
