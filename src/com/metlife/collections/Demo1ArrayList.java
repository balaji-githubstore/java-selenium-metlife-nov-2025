package com.metlife.collections;

import java.util.ArrayList;
import java.util.List;
//Generic
public class Demo1ArrayList {

    public static void main(String[] args) {

        ArrayList<String> colors=new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        colors.add("red");

        colors.remove("green");


        System.out.println(colors);
        System.out.println(colors.size());

        System.out.println(colors.get(1));

        for(String color : colors)
        {
            System.out.println(color);
        }
    }
}
