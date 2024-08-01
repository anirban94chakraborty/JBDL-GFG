package com.gfg.thread;

public class RunnableDemo {

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        myTask.run();  // Will display 'main' as no new child thread is created

        Thread thread = new Thread(myTask);   // Creation of child thread of 'main'
        thread.setName("Worker-01");
        thread.start();  // Executes the run() method of the child thread object
    }
}
