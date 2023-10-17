package src.com.bootcoding.java.collection;

import java.util.LinkedList;

public class LinkedListOfList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("om");
        list.add("ram");
        list.add("priya");

        System.out.println(list);

        list.remove(1);

        list.add(1,"sham");
        System.out.println(list.get(1));
        list.set(1,"lakshman");
        System.out.println(list);


    }

}
