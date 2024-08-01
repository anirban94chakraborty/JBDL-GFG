package com.gfg.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        /* =========== Creating a custom thread pool ============== */
        int corePoolSize = 5;
        int maxPoolSize = 10;
        long keepAliveTime = 5000;

        ExecutorService threadPoolExecutor =
                new ThreadPoolExecutor(
                    corePoolSize, // Initial no. of worker threads
                    maxPoolSize, // Max. no. of worker threads
                    keepAliveTime, // Time duration for which an idle thread is kept alive in the pool
                    TimeUnit.MILLISECONDS, // unit of time for keepAliveTime parameter
                    new LinkedBlockingQueue<Runnable>(200) /*  Blocking queue used to hold tasks waiting
                                                                       [Capacity should be preferably more than
                                                                       the number of tasks; otherwise, can lead to
                                                                       exception]
                                                                    */
                );

        /* ========== Implementing the custom thread pool ========= */
        Long start = System.currentTimeMillis();
        for(int i=0; i<100; i++) {
            int finalI = i;
            threadPoolExecutor.submit(() -> {
                System.out.println("Task " + finalI + " Running in : " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        threadPoolExecutor.shutdown();
        try {
            threadPoolExecutor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Long end = System.currentTimeMillis();
        System.out.println("Total time : " + (end - start) + " ms");
    }
}
