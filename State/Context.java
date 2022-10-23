package State;

import State.state.Status;

public class Context {
    private Status status;

    public Context(){
        this.status=null;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus(){
        return this.status;
    }
}
