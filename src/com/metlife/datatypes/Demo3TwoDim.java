package com.metlife.datatypes;

public class Demo3TwoDim {
    public static void main(String[] args) {

        String[][] arr={{"peter","peter123"},{"john","john123"},{"ken","ken123"}};
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

        Object[][] arr2=new Object[3][2];
        //i--> number of testcase
        //j --> number of parameters

        arr2[0][0]="peter";
        arr2[0][1]=893.6;

        arr2[1][0]=78;
        arr2[1][1]="john123";

        arr2[2][0]="ken";
        arr2[2][1]="ken123";


        Object a=10;  //boxing
        Object b=10.3;
        Object c="kim";

        int z= (int) a;   //unboxing --> changing to specific type

        double x= (double) c; //unboxing

        System.out.println(z);
        System.out.println(x);



    }
}
