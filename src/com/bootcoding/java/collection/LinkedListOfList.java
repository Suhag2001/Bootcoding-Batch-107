package src.com.bootcoding.java.collection;

import java.util.LinkedList;
import java.util.List;
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
        list.add(1,"upanshu");
        System.out.println(list);
        System.out.println(list.get(1));

        list.set(1,"lakshman");
        list.isEmpty();
        list.addLast("priya");
        System.out.println(list);

        List<String> list2 = new LinkedList<>();
        list2.addAll(list);
        list2.add("radhika");
        System.out.println(list);

        System.out.println("clone : "+list2);


        System.out.println(list);

        System.out.println("indexOf : " +list.indexOf("lakshman"));;
        System.out.println(list.contains("lakshman"));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));;
        }

        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }

}
