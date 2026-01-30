package com.tap.nirjala.demo.shallow_deep_copy;

public class Clone implements Cloneable {
    String Name;
    int id;

    public Clone(String Name,int id){
        this.Name=Name;
        this.id=id;
    }

    public void show(){
        System.out.println("Name is: "+Name);
        System.out.println("ID :"+id);
    }

    @Override
public String toString() {
    return Name + " " + id;
}
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

