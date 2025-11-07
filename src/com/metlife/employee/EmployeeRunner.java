package com.metlife.employee;

import com.metlife.formulae.Area;

public class EmployeeRunner {

    public static void main(String[] args) {

        Employee.companyName="Metlife";

        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();

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


        Employee.printEmployeeRecord(emp1);
        Employee.printEmployeeRecord(emp2);
        Employee.printEmployeeRecord(emp3);

        emp1.displayEmployeeRecord();
        emp2.displayEmployeeRecord();
        emp3.displayEmployeeRecord();



    }
}
