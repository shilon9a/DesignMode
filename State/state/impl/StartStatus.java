package State.state.impl;

import State.Context;
import State.state.Status;

public class StartStatus implements Status {

    @Override
    public void doAction(Context context) {
        System.out.println("this is Start");
        context.setStatus(this);
    }


}
