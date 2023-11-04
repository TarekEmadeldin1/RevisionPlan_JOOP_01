package org.example;

public class Encapsulation {
    private String name ;
    private int id ;

    public void SetName(String name){
        this.name=name;
    }
    public void SetId(int id ){
        this.id=id;
    }

    public String GetName(){
        return name;
    }

    public int GetId(){
        return id;
    }

}
