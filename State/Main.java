package State;

import State.state.Status;
import State.state.impl.StartStatus;

public class Main {
    public static void main(String[] args) {
        Context contextStop=new Context();
        Context contextStart=new Context();

        Status start=new StartStatus();
        start.doAction(contextStart);
        contextStart.getStatus();
    }
}
