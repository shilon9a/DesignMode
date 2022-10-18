package Command;

import Command.Order.Order;
import Command.Order.impl.StockBuy;
import Command.Order.impl.StockSell;

public class Main {
    public static void main(String[] args) {
        Order Buy=new StockBuy(new Stock("a",111));
        Order Sell=new StockSell(new Stock("b",222));
        OrderCommand orderCommand=new OrderCommand();
        orderCommand.addOrder(Buy);
        orderCommand.addOrder(Sell);

        orderCommand.placeOrder();
    }
}
