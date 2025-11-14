package com.metlife.collections;

import java.util.HashMap;
//generic collection
public class Demo3HashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(101,"john");
        map.put(102,"peter");
        map.put(103,"saul");

        map.put(102,"kim");

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(102));

        if(map.containsKey(104))
        {
            System.out.println(map.get(104));
        }



    }
}
