package com.gfg;

import java.util.Scanner;

public class ClassObjectDemo {

    public static void main(String[] args) {

        System.out.println("Starting main method");

        // Call function for local object creation
        simpleMethod();

        System.out.println("Back to main method");

        // Pause for input for Analysis of Object in Heap Memory Analysis in VirtualVM tool
        Scanner sc = new Scanner(System.in);
        System.out.println("enter something");
        String data = sc.nextLine();
        System.out.println(data);

        // New object of 'org.gfg.demo.Lecture' class
        Lecture l1 = new Lecture();
        l1.setName("L01");
        l1.setMentor("Sashi");
        l1.setStatus("Upcoming");

        // Pause for input for Analysis of Object in Heap Memory Analysis in VirtualVM tool
        sc = new Scanner(System.in);
        System.out.println("enter something");
        data = sc.nextLine();
        System.out.println(data);

        // Prints 'class-name@hashcode'
        System.out.println(l1);  // {Eg: org.gfg.demo.Lecture@3feba861}

        // Print the hash-code of the parent class of the object
        System.out.println(l1.getMentor().hashCode()); // same value as the previous line
    }

    private static void simpleMethod() {
        System.out.println("Starting simpleMethod method");
        Lecture l0 = new Lecture();
        l0.setName("L0");
        l0.setMentor("Shashi");
        l0.setStatus("Live");
    }
}
