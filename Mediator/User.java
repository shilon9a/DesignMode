package Mediator;

import Builder.Packing.Pack;

public class User {
    private String name;

    public String getName(){
        return name;
    }
    public User(String name){
        this.name=name;
    }

    public void SendMsg(String msg){
        ChatRoom.showMsg(this,msg);
    }
}
