package com.gfg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorDemo {

    private static List<Date> dateList = new ArrayList<>();

    public static void main(String[] args) {
        // normalMethod();
        demoHeapOutOfMemory();  // this call causes 'OutOfMemoryError'
    }

    public static void normalMethod() {
        System.out.println("Normal Method");
        // normalMethod();  // unchecked recursive call leads to 'StackOverflowError'
    }

    private static void demoHeapOutOfMemory() {
        while(true) {
            Date date = new Date();
            dateList.add(date);
        }
    }
}
