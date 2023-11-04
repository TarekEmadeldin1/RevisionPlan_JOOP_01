package org.example;

public class Students extends Parents{
    public static int count = 0 ;
    public Students(String name , int id , double grade ,String address ){
        super(name,id,grade,address);
        count++;
        System.out.println("Student name is : " + name + " , " + "Student id is : " + id  + " , " + "Student Grade is :" + grade + " , " + "Student Address is : " + address );
        System.out.println("count number is" + count);
    }

    public Students(){
        count++;
    }

    public void Registering_Course(){
        System.out.println("Registering Course");
    }

    public void Taking_Exam(){
        System.out.println("Taking Exam");
    }

    public static void Comparing(Students student1 , Students student2){
        if(student1.name==student2.name && student1.id==student2.id && student1.grade==student2.grade && student1.address==student2.address)
            System.out.println("Both Student Informations is Equal");
        else
            System.out.println("Both Students Informations is NOt Equal");
    }
}
