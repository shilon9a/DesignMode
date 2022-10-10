package Builder.item.Bugger.impl;

import Builder.Packing.Pack;
import Builder.item.Bugger.Bugger;

public class BuggerTwo extends Bugger  {
    @Override
    public double Price() {
        return 2.2;
    }

    @Override
    public String Name() {
        return "BuggerTwo";
    }
}
