package org.example;

public class Teachers extends Parents{
    public static int count = 0;
    public Teachers(String name , int id , String address){
        super(name, id, address);
        System.out.println("Teacher Name is : " + name + " , " + "Teacher id is : " + id + " , " + "Teacher address is : " + address);
        count++;
    }

    public void Teaching_Course(){
        System.out.println("Teaching Course");
    }
}
