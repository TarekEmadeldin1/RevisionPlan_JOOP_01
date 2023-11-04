package org.example;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Ahmed",15101234,3.3,"Heliopolis");
        student1.Registering_Course();
        student1.Taking_Exam();
        Students student2 = new Students("Tarek",15204212,2.8,"Nasr City");
        student2.Registering_Course();
        student2.Taking_Exam();
        Teachers teacher1 = new Teachers("Abbas",1,"Abbaseya");
        teacher1.Teaching_Course();
        Students.Comparing(student1,student2);
        Encapsulation encapsulation=new Encapsulation();
        encapsulation.SetName("Bondo2");
        encapsulation.SetId(2);
        System.out.println("Encapsulation Name is : " + encapsulation.GetName());
        System.out.println("Encapsulation Id is : " + encapsulation.GetId());
        Polymorphism.Summation(2.3,5.5);
        SalaredEmployee FulltimeEmployee = new SalaredEmployee();
        FulltimeEmployee.Salary=12000;
        System.out.println(FulltimeEmployee.Salary);
        HourlyEmployee Parttime = new HourlyEmployee();
        Parttime.HourRate= 100 ;
        Parttime.Hours=40;
        System.out.println(Parttime.EmployeesSalaries());

    }
}