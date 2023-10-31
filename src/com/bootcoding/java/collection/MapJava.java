package src.com.bootcoding.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapJava {


    public static void main(String[] args) {
//
//        1.HashMap
//        2.LinkedHashMap
//        3.TreeMap

        
        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(1,"Om");
        map.put(67, "ankit");
        map.put(45,"ankur");
        map.put(23, "shravan");

        System.out.println(map.get(1));
        System.out.println(map.containsKey(67));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
//        System.out.println(map.remove(45));
        System.out.println(map);




    }

}
