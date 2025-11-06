package com.metlife.methods;


import com.metlife.formulae.Area;

public class Demo1Methods {

    public static void main(String[] args) {

        int radius = 10;

        Area obj=new Area();

        double result = obj.areaOfCircle(10);
        System.out.println(result);

        result = obj.areaOfCircle(20);
        System.out.println(result);

        result = Area.areaOfRectangle(10, 10);
        System.out.println(result);

        System.out.println(Area.areaOfRectangle(10.2, 10.2));

        System.out.println(Area.areaOfTriangle(25, 1));

        String myName = obj.getAuthorName();
        System.out.println(myName);

        Area.quit();
    }
}
