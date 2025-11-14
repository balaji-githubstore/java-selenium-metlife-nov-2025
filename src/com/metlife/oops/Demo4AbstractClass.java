package com.metlife.oops;

abstract class Employee
{
    private String empName;
    public String getEmpName()
    {
        return empName;
    }

    public abstract void calculateSalary();
}
class PermanentEmployee extends Employee
{

    @Override
    public void calculateSalary() {

    }
}
public class Demo4AbstractClass {

    public static void main(String[] args) {
        Employee e=new PermanentEmployee();

        e.getEmpName();
        e.calculateSalary();
    }
}
