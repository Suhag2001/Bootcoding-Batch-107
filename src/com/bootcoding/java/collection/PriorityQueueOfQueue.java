package src.com.bootcoding.java.collection;

import java.util.*;

public class PriorityQueueOfQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(4);
        queue.offer(6);
        queue.offer(8);
        queue.offer(12);
        queue.offer(1);
        queue.offer(0);
        System.out.println(queue);

    }
}
