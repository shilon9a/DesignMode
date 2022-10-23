package State.state.impl;

import State.Context;
import State.state.Status;

public class StopStatus implements Status {
    @Override
    public void doAction(Context context) {
        System.out.println("this is Stop");
        context.setStatus(this);
    }
}
