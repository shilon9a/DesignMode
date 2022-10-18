package Command.Order.impl;

import Command.Order.Order;
import Command.Stock;

public class StockBuy implements Order{
    private Stock stock;

    public StockBuy(Stock stock){
        this.stock=stock;
    }


    @Override
    public void Execute() {
        stock.buy();
    }
}
