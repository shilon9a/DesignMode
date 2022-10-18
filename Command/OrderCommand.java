package Command;

import Command.Order.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderCommand {
    List<Order> orders=new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public void placeOrder(){
        for (Order order:orders){
            order.Execute();
        }
        orders.clear();
    }
}
