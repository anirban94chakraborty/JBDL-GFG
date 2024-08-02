package com.gfg.callable;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class CallableDemo {

    /*
    * Since 'Runnable' interface's run() method is of type 'void', so no value can be returned from it.
    * To return values from the executing thread, we can use the 'Callable' interface, which has an equivalent
    * call() method that can return values
    */

    public static void main(String[] args) {

//        Callable<String> callable = new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                // Make API Call
//                return "FlightDate";
//            }
//        };

        // Equivalent code of above code using Lambda Expression
        Callable<String> callable = () -> {
            System.out.println("Executing in " + Thread.currentThread().getName());
            // Make API Call
            return "FlightDate";
        };

        // Running a single task using Callable object and ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> futureData = executorService.submit(callable);
        try {
            System.out.println(futureData.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        // Running multiple tasks using Callable object and ExecutorService
        List<Callable<String>> callableList = new LinkedList<>();
        callableList.add(callable);
        callableList.add(callable);
        callableList.add(callable);

        try {
            List<Future<String>> futureList = executorService.invokeAll(callableList);
            for(Future<String> future: futureList) {
                System.out.println(future.get());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
