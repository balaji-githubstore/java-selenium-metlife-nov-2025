package com.metlife.employee;

public class Employee {
    public int id;
    public String name;
    public double salary;
    public String performance;
    public static String companyName;

    public void displayEmployeeRecord()
    {
        //here we can call all non-static and static variable
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(performance);
        System.out.println(Employee.companyName);
        System.out.println("------------------");
    }

//    public static void printCompanyName()
//    {
//        System.out.println(Employee.companyName);
//    }

    /**
     * Not effient
     * @param e
     */
    public static void printEmployeeRecord(Employee e)
    {
        //cannot call non-static variable
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.salary);
        System.out.println(e.performance);
        System.out.println(Employee.companyName);
        System.out.println("------------------------------");
    }


    public static Employee getEmployeeInstance()
    {
        Employee e=new Employee();
        return e;
    }

}
