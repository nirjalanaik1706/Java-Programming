package com.tap.nirjala.demo.shallow_deep_copy;

public class Clone implements Cloneable {
    public String Name;

    public Clone(String Name){
        this.Name=Name;
    }

    public void show(){
        System.out.println("Name is: "+Name);
    }

    @Override
public String toString() {
    return Name ;
}
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

