package com.metlife.datatypes;

public class Demo2Datatypes {

    public static void main(String[] args) {

        //10,20,30,40,50

        int[] numbers=new int[5]; //5*32 bits

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
//        numbers[4]=50;

        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);

        //4.5, 55.55, 4454.4
        double[] arr1=new double[3]; //3*64 bits
        arr1[0]=10;
        arr1[1]=65.4;
        arr1[2]=55.55;

        boolean[] arr2=new boolean[2];  // 2*1 bits
        System.out.println(arr2[1]);

        //create an array to store red, green, yellow
        String[] colors=new String[3];  //allocate the index with null

        colors[0]="red";
        //colors[1]="green";
        colors[2]="yellow";

        //colors-->total memory --> 14*16 bits

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

        String[] colors1={"jack","peter","ken"};
        int[] nums={45,55,78,454};

        System.out.println(colors1.length);
        System.out.println(colors1[1]);

        int radius=10;

       double result= (4*3.14*radius*radius*radius)/3;
       System.out.println(result);
       System.out.println(22/7);


       double c= 11/(double)2;

        System.out.println(c);
    }

}
