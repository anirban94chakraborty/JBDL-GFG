package com.gfg.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {
        arrayDemo();

        // Using ArrayList from Collection interface (dynamic-sized arrays)
        List<String> studentsList = new ArrayList<>();

        // Add elements to the ArrayList
        studentsList.add("Neeraj");
        studentsList.add("Deeraj");

        // Print elements of the ArrayList
        System.out.println(studentsList);

        // Add more elements to the ArrayList
        studentsList.add("Ajay");
        studentsList.add("Vijay");

        System.out.println(studentsList);

        // Sort the elements of the ArrayList
        Collections.sort(studentsList);
        System.out.println(studentsList);
    }

    public static void arrayDemo() {
        // A String object
        String name = "Ravi";

        // Array of String objects (fixed-size array)
        String[] students = new String[2];

        // Inserting elements in an array using index
        students[0] = "Ravi";
        students[1] = "Rahul";

        System.out.println(students);  // This prints the hashcode of the object
        printArray(students); // Prints all the element of the array

        // students[2] = "Vijay"; // This will throw exception (ArrayIndexOutOfBoundsException)

        // Resizing the array to store new elements
        String[] temp = new String[4];
        int i=0;
        for(String str: students) {
            temp[i] = students[i];
            i++;
        }
        students = temp;
        students[2] = "Vijay";
        students[++i] = "Ajay";
        printArray(students);

        // Sort array elements and display
        Arrays.sort(students);
        printArray(students);
    }

    public static void printArray(String[] arr) {
        // for(String str: arr)
        //    System.out.print(str + " ");
        // System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
