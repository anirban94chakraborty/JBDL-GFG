package com.gfg.thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
