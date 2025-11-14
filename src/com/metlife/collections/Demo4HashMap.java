package com.metlife.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//generic collection
public class Demo4HashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(101,"john");
        map1.put(102,"peter");
        map1.put(103,"saul");

        HashMap<Integer,String> map2=new HashMap<>();
        map2.put(101,"john1");
        map2.put(102,"peter1");
        map2.put(103,"saul1");

        List<Map<Integer ,String>> list=new ArrayList<>();

        list.add(map1);
        list.add(map2);

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(0).get(103));

        System.out.println(list.get(1).get(103));
    }
}
