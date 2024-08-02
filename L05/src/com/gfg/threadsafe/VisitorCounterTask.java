package com.gfg.threadsafe;

import java.util.concurrent.atomic.AtomicInteger;

public class VisitorCounterTask implements Runnable{
    private int counter;

    private AtomicInteger atomicCounter = new AtomicInteger();    // Alternative to using synchronized methods

    private void increment() {  /* 'synchronized' can be used for avoiding race condition / memory inconsistency errors
                                    while incrementing the 'counter' value
                                 */
        counter++;
        atomicCounter.incrementAndGet();
    }

    @Override
    public void run() {
        increment();
    }

    @Override
    public String toString() {
        return "VisitorCounterTask{" +
                "counter=" + counter +
                ", atomicCounter=" + atomicCounter +
                '}';
    }
}
