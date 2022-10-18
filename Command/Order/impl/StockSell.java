package Command.Order.impl;

import Command.Order.Order;
import Command.Stock;

public class StockSell implements Order {
    private Stock stock;

    public StockSell(Stock stock){
        this.stock=stock;
    }

    @Override
    public void Execute() {
        stock.sell();
    }
}
