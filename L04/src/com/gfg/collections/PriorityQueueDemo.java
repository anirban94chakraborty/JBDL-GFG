package com.gfg.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        /*
         Implementation of Heap
         Min Heap: root element is smallest one
         Max Heap: root element in largest one
         Queue<Integer> integerQueue = new PriorityQueue<>();  // MinHeap
        */

        Queue<Integer> integerQueue = new PriorityQueue<>(Comparator.reverseOrder()); // MaxHeap

        integerQueue.add(2);
        integerQueue.add(1);
        integerQueue.offer(25);
        integerQueue.add(5);
        integerQueue.add(15);

        System.out.println(integerQueue);

        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());

        /*
        --------------------------------------------------------------------
         Priority Queue of objects of custom classes
        */

        Product product1 = new Product("Laptop", 50000.00, 4);
        Product product2 = new Product("Pen", 50.00, 5);
        Product product3 = new Product("Mouse", 500.00, 1);
        Product product4 = new Product("Monitor", 10000.00, 3);

        PriorityQueue<Product> productPriorityQueue = new PriorityQueue<>();
        productPriorityQueue.add(product2);
        productPriorityQueue.add(product1);
        productPriorityQueue.add(product3);
        productPriorityQueue.add(product4);

        System.out.println(productPriorityQueue.poll());
        System.out.println(productPriorityQueue.poll());

        System.out.println("---------------------------------------");

        //Using Rating to sort the Product objects in the PriorityQueue
        PriorityQueue<Product> productPriorityQueueForRating = new PriorityQueue<>(
                (o1, o2) -> o2.getRating().compareTo(o1.getRating())
        );
        productPriorityQueueForRating.add(product2);
        productPriorityQueueForRating.add(product1);
        productPriorityQueueForRating.add(product3);
        productPriorityQueueForRating.add(product4);

        System.out.println(productPriorityQueueForRating.poll());
        System.out.println(productPriorityQueueForRating.poll());
    }
}
