package Builder.item.Bugger;

import Builder.Packing.Pack;
import Builder.Packing.impl.Wrapper;
import Builder.item.Item;

public abstract class Bugger implements Item {

    @Override
    public Pack pack() {
        return new Wrapper();
    }

    @Override
    public abstract String Name();
}
