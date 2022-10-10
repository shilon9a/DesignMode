package Prototype.Shape;

public abstract class Shape implements Cloneable{

    protected String type;
    protected Integer id;

    public String getType(){
        return type;
    };

    public abstract void draw();

    public abstract Integer getId();

    public void setId(Integer id){
        this.id=id;
    }

    public Object clone(){
        Object clone=null;
        try{
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
