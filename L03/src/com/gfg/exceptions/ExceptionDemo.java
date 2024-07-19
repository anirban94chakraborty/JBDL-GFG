package com.gfg.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        String name = "Rahul";

        System.out.println("Starting");
        try {
            System.out.println(name.charAt(10));  // leads to 'IndexOutOfBoundsException'
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
        System.out.println("Done");

        //----------------------------------------------------------------------------------------------
        /*
            Creation of an object of the FileReader class requires exception handling as it throws
            FileNotFoundException by definition

            ** Child Exceptions should be handled first, then the Parent Exceptions are handled
        */
        try {
            FileReader fileReader = new FileReader("C:\\Users\\anirb\\Desktop\\file.txt");
            int a = fileReader.read();
            System.out.println(a);
        } catch (FileNotFoundException e) {
            // throw new RuntimeException(e);
            System.out.println("FileNotFoundException occurred");
        } catch (IOException e) {
            // throw new RuntimeException();
            System.out.println("IOException occurred");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //----------------------------------------------------------------------------------------------
        // Example of Runtime Exception handling
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.next();
        if(name.length() > 2) {
            System.out.println(name.charAt(2));   // Can throw exception depending on the provided user input
                                                  // (Unchecked Exception)
        }
        else {
            System.out.println("Name length is less than 2");
        }
    }

    public static void readFromFile() throws FileNotFoundException {
        // Handling checked exceptions:--
        // Approach #1: Using Try/Catch block
        // Approach #2: Using 'throws' in the method signature for the calling method to handle the exception
        //              Here, in this method, the Approach #2 is used
        FileReader fileReader = new FileReader("C:\\Users\\anirb\\Desktop\\file.txt");
    }

    public void demoTryWithResource() {
        // FileReader resource will be autoclosed after execution of the try/catch block
        // since we are using try with resource
        try(FileReader fileReader = new FileReader("C:\\Users\\anirb\\Desktop\\file.txt")) {
            int a = fileReader.read();
            System.out.println(a);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
