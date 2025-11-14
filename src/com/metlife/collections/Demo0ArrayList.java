package com.metlife.collections;

import com.metlife.employee.Employee;

import java.util.ArrayList;
//non-generic type - not recommended

public class Demo0ArrayList {
    public static void main(String[] args) {

        ArrayList list=new ArrayList();

        list.add(10); //boxing //converting to object type
        list.add(102.2);
        list.add("jack");
        list.add(new Employee(101));

        int x= (int) list.get(0);  //unboxing



    }
}
