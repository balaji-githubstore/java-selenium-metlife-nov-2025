package com.metlife.collections;

import java.util.ArrayList;
import java.util.List;

//Generic
public class Demo2ArrayList {

    public static void main(String[] args) {

        List<Integer> colors=new ArrayList<>();

        colors.add(55);
        colors.add(77);
        colors.add(555);
        System.out.println(colors);
        System.out.println(colors.size());

        System.out.println(colors.get(1));


    }
}
