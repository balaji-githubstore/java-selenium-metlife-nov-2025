package com.metlife.logics;

public class Demo1 {

    public static void main(String[] args) {

        int[] arr={10,20,30,40,50,60};

        for(int a=0;a<arr.length;a++)
        {
            System.out.println(arr[a]);
        }

        for(int a : arr)
        {
            System.out.println(a);
        }
    }
}
