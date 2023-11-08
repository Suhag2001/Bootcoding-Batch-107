package src.com.bootcoding.java.collection;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LinkedListOfList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("om");
        list.add("ram");
        list.add("priya");
        list.set(1, "Prachi");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        list.add(1,"sham");
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,"lakshman");
        list.isEmpty();
        list.addLast("priya");
        LinkedList<String> list2 = (LinkedList<String>) list.clone();
        System.out.println("clone : "+list2);


        System.out.println(list);

        System.out.println(list.indexOf("lakshman"));;
        System.out.println(list.contains("lakshman"));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));;
        }

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }

}
