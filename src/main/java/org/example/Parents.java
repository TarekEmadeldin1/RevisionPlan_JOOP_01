package org.example;

import org.openqa.selenium.WebDriver;

public class Parents {
    public String name ;
    public int id ;
    public double grade ;
    public String address ;

    public Parents(String name , int id , double grade , String address){
        this.name= name ;
        this.id= id ;
        this.grade=grade;
        this.address=address;

    }

    public Parents(){
    }

    public Parents(String name , int id , String address){
        this.name=name;
        this.id=id;
        this.address=address;
    }
}
