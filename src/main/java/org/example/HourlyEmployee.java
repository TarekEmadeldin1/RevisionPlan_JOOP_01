package org.example;

public class HourlyEmployee extends Employees{
    public double HourRate ;
    public int Hours ;

    public double EmployeesSalaries(){
        return Hours * HourRate;
    }
}
