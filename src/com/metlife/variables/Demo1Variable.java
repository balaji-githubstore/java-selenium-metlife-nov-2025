package com.metlife.variables;

public class Demo1Variable {

    public static int aS=10;   //static variable or class variable
    public static int bS=20;

    public int aNS=10;      //non-static variable or instance variable
    public int bNS=20;

    public static void main(String[] args) {

        Demo1Variable.aS=2000;

        System.out.println(Demo1Variable.aS);
        System.out.println(Demo1Variable.bS);

        Demo1Variable obj1=new Demo1Variable();
        Demo1Variable obj2=new Demo1Variable();

        String name="ff";

        obj1.aNS=5000;

        System.out.println(obj1.aNS);
        System.out.println(obj1.bNS);

        System.out.println(obj2.aNS);
        System.out.println(obj2.bNS);


    }
}
