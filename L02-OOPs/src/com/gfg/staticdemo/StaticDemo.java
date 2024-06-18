package com.gfg.staticdemo;

import com.gfg.objectclassdemo.Laptop;

import java.util.Scanner;

public class StaticDemo {

    public static void main(String[] args) {
        // Laptop.start();  // Invalid (can be accessed via an object)
        // Laptop.toString(); // Invalid (can be accessed via an object)

        Laptop laptop = new Laptop("Windows 11", "i7 10750H");
        laptop.start();

        System.out.println(Laptop.laptopCount); // Call to static member using the Class name

        Laptop laptop2 = new Laptop("Mac", "M3 Pro");
        laptop2.start();

        System.out.println(Laptop.laptopCount); // Call to static member using the Class name

        Laptop laptop3 = new Laptop("Linux", "i5 6th Generation");
        laptop3.start();

        System.out.println(Laptop.laptopCount); // Call to static member using the Class name
        System.out.println(Laptop.designData()); // Call to static member using the Class name

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data to exit");
        String data = scanner.nextLine();
    }
}


