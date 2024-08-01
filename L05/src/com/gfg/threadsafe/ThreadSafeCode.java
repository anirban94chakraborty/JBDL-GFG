package com.gfg.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeCode {
    public static void main(String[] args) throws InterruptedException {
        int numTasks = 100000;
        ExecutorService executorService = Executors.newFixedThreadPool(2000);
        AtomicInteger counter = new AtomicInteger(0); // Thread-safe counter variable (data structure)

        for (int i = 0; i < numTasks; i++) {
            executorService.submit(() -> {
                // Perform task
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Increment counter
                synchronized (counter) {
                    counter.incrementAndGet();
                }
            });
        }

        // Wait for all tasks to complete execution
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        // Print total number of tasks executed
        System.out.println("Total tasks executed: " + counter.get());
    }
}
