package com.metlife.datatypes;

import java.util.Locale;

public class Demo1Datatypes {

    public static void main(String[] args) {

        byte myNumber=100; //myNumber is reserved for byte -->  8 bits

        short myNumber1=100; //myNumber1 is reserved for short --> 16 bits

        int myNumber2=100; //32 bits of memory used

        long myNumber3=1009787878787L; //64 bits of memory used

        //1000 students --> byte --> 8*1000=8000 bits of memory
        //1000 students --> int --> 32*1000=32000 bits of memory


        float a=1.123456789f; //32 bit

        double b=1.123456789; //64 bits

        boolean check=true; //1 bit

        char letter='F'; //16 bits

        //non-pre-defined
        String myName="Bala";  //16*4 bits
        System.out.println(myName);
        System.out.println(myName.length());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.charAt(2));

//        System.out.println(myNumber);
//        System.out.println(myNumber1);
//        System.out.println(myNumber2);
//        System.out.println(myNumber3);
//
//        System.out.println(a);
//        System.out.println(b);


    }
}
