package com.metlife.employee;

import com.metlife.formulae.Area;

import java.util.ArrayList;

public class EmployeeRunner {

    public static void main(String[] args) {


        Employee.companyName="Metlife";

        Employee emp1=new Employee(101);
        Employee emp2=new Employee(102,"kim");
        Employee emp3=new Employee("ken",103);
        Employee emp4=new Employee(1.2);

//        Employee emp4=Employee.getEmployeeInstance();
//        Employee.printEmployeeRecord(emp4);


        //(101, Saul, 8000, Good, Metlife)
        emp1.id=101;
        emp1.name="Saul";
        emp1.salary=8000;
        emp1.performance="Good";

        //(102, Kim, 5000, Excellent, Metlife)
        emp2.id=102;
        emp2.name="Kim";
        emp2.salary=5000;
        emp2.performance="Excellent";


//        Employee.printEmployeeRecord(emp1);
//        Employee.printEmployeeRecord(emp2);
//        Employee.printEmployeeRecord(emp3);

        emp1.displayEmployeeRecord();
        emp2.displayEmployeeRecord();
        emp3.displayEmployeeRecord();

    Employee[] arr=new Employee[4];
    arr[0]=emp1;
    arr[1]=emp2;

        System.out.println(arr[1].id);
        System.out.println(emp2.id);
        System.out.println(arr.length);

        ArrayList<Employee> list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);

        System.out.println(list.size());
        System.out.println(list.get(1).id);

        for(Employee e : list)
        {
            System.out.println(e.id);
        }
    }
}
