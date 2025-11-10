package com.metlife.methodoverloading;

public class CalcRunner {
    public static void main(String[] args) {

        Calculator cal=new Calculator();

        //the method to be called is resolved during compile time
        cal.add(1,1);

        System.out.println("");

        System.out.println(Math.max(11.2,11.3));
    }
}
