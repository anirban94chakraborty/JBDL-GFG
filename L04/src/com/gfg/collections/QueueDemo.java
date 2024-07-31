package com.gfg.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(2);
        integerQueue.add(5);
        integerQueue.add(15);
        integerQueue.offer(25);

        System.out.println(integerQueue);

        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
    }
}
/*
DSA
- Level Order Traversal
- Task Scheduling
- Message Polling (Producer, Consumer)
- Shortest path in Graph
 */
