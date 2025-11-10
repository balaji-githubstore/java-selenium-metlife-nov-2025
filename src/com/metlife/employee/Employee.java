package com.metlife.employee;

public class Employee {
    public int id; //non-static variable
    public String name;
    public double salary;
    public String performance;

    public static String companyName;

    public Employee(int id)
    {
        this.id=id;
    }

    public Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public Employee(String name,int id)
    {
        this(id,name);
    }

    public Employee(double id)
    {

    }

    public void displayEmployeeRecord() {
        //here we can call all non-static and static variable
        int id=0; //local variable
        System.out.println(id);
        System.out.println(this.id); //non-static variable
        System.out.println(this.name);
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
     *
     * @param e
     */
    public static void printEmployeeRecord(Employee e) {
        //cannot call non-static variable
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.salary);
        System.out.println(e.performance);
        System.out.println(Employee.companyName);
        System.out.println("------------------------------");
    }


//    public static Employee getEmployeeInstance() {
//        Employee e = new Employee();
//        return e;
//    }

}
