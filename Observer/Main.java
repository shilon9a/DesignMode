package Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject=new Subject();
        HexaObserve hexaObserve=new HexaObserve();
        hexaObserve.attach(subject);
        OctalOberve octalOberve=new OctalOberve();
        octalOberve.attach(subject);
        BinaryObserve binaryObserve=new BinaryObserve();
        binaryObserve.attach(subject);

        System.out.println("this is first");
        subject.setStatus(1);
        System.out.println("this is second");
        subject.setStatus(2);
    }
}
