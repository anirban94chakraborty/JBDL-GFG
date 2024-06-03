package org.gfg.demo;

import java.util.Scanner;

public class ClassObjectDemo {

    public static void main(String[] args) {

        // New object of 'org.gfg.demo.Lecture' class
        Lecture l0 = new Lecture();
        l0.setName("L0");
        l0.setMentor("Sashi");
        l0.setStatus("Live");

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
        System.out.println(l0);  // {Eg: org.gfg.demo.Lecture@5f184fc6}
        System.out.println(l1);  // {Eg: org.gfg.demo.Lecture@3feba861}

        // Print the hash-code of the parent class of the object
        // Same hash-code will be returned since the getMentor() method returns the same String object "Sashi"
        System.out.println(l0.getMentor().hashCode());
        System.out.println(l1.getMentor().hashCode()); // same value as the previous line
    }
}
