package com.gfg.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        // ExecutorService executorServiceSingleWorker = Executors.newSingleThreadExecutor();  // For creating a single thread executor
        ExecutorService executorService = Executors.newFixedThreadPool(10);  // Creates an executor with a thread pool of 10 threads
        Long start = System.currentTimeMillis();
        for(int i=0; i<100; i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println("Task " + finalI + " Running in : " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            // executorService.submit(new MyTask());
        }
        executorService.shutdown();  /* makes the executor service to stop accepting new tasks,
                                        and wait for previously submitted tasks to complete execution,
                                        and then finally terminate the executor
                                      */
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Long end = System.currentTimeMillis();
        System.out.println("Total time : " + (end - start) + " ms");
    }
}
