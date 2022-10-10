package Builder.item.Drink.impl;

import Builder.item.Drink.Drink;

public class Coke extends Drink {
    @Override
    public String Name() {
        return "Coke";
    }

    @Override
    public double Price() {
        return 3;
    }
}
