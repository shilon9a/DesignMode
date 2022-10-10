package Builder.item.Drink;

import Builder.Packing.Pack;
import Builder.Packing.impl.Bottle;
import Builder.item.Item;

public abstract class Drink implements Item {
    @Override
    public Pack pack() {
        return new Bottle();
    }
}
