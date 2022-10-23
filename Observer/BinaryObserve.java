package Observer;

public class BinaryObserve extends Observe{
    @Override
    public void update() {
        System.out.println("Binary String:"+Integer.toBinaryString(subject.getStatus()));
    }
}
