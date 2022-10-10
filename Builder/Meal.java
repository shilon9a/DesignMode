package Builder;

import Builder.item.Item;

import java.util.*;

public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public double costPrice(){
        double sum=0.0;
        for(Item item:itemList){
            sum+=item.Price();
        }
        return sum;
    }

    public void showItems(){
        for(Item item:itemList){
            System.out.println("Name:"+item.Name());
            System.out.println("Price:"+item.Price());
            System.out.println("Pack:"+item.pack());
        }
    }

}