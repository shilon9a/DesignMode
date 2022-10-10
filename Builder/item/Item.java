package Builder.item;

import Builder.Packing.Pack;

public interface Item {
    String Name();
    double Price();
    Pack pack();
}
