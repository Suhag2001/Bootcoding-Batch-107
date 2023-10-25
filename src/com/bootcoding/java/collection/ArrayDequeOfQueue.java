package src.com.bootcoding.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeOfQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(5);
        queue.offer(3);
        queue.offer(4);

        queue.add(2);

        System.out.println(queue.contains(4));
        queue.addFirst(9);

        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
