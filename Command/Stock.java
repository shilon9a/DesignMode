package Command;

public class Stock {
    private String name;
    private double price;

    public Stock(String name,double price){
        this.name=name;
        this.price=price;
    }


    public void buy(){
        System.out.println("name:"+name+ " "+"price:"+price+" "+"Buy");
    }
    public void sell(){
        System.out.println("name:"+name+ " "+"price:"+price+" "+"Sell");
    }

}
