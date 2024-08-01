package com.gfg.thread;

public class MultiThreadDemo {

    public static void main(String[] args) {

        // By default, the 'main' thread will execute the following statements (instructions)
        System.out.println("Hello");
        System.out.println("Have a Good Day!");
        System.out.println("Bye!");
        System.out.println(Thread.currentThread().getName());

        MyThread myThread = new MyThread(); // Object for creating child thread
        myThread.setName("MyThread-01"); // Set name of child thread
        myThread.start(); // Begin execution of child thread -> executes the run() method of MyThread class
        try {
            myThread.join();  // Instruct parent thread (main) to wait for child thread to terminate/complete execution
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done by " + Thread.currentThread().getName());
    }
}
