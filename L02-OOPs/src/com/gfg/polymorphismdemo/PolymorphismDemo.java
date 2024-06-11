package com.gfg.polymorphismdemo;

import com.gfg.interfacedemo.TataCar;
import com.gfg.interfacedemo.TataPunch;
import com.gfg.interfacedemo.TataSafari;
import com.gfg.interfacedemo.TataTiago;

import java.util.Scanner;

public class PolymorphismDemo {

    public static void main(String[] args) {

        // Compile Time Polymorphism (Method Overloading) -----------------------------------------
        AreaCalculator areaCalculator = new AreaCalculator();
          /*Different area() methods will be called based on the parameters passed*/
        System.out.println(areaCalculator.area(5.0));
        System.out.println(areaCalculator.area(5.0, 10.0));



        // Runtime Polymorphism (Method Overriding) ----------------------------------------------
        TataCar tataCar = null;
        System.out.println("Enter the Car Model:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("tiago")) {
            tataCar = new TataTiago();
        } else if (input.equals("punch")) {
            tataCar = new TataPunch();
        } else {
            tataCar = new TataSafari();
        }
        System.out.println(tataCar.getRC()); /* call to getRC() method will depend on which class object's reference
                                                gets assigned to the tataCar reference variable */
        System.out.println(tataCar.getCompanyName()); // call to getCompanyName() method of 'TataCar' class (parent)
        System.out.println(tataCar.getMusicSystem()); // call to getMusicSystem() method based on hierarchical availability
    }
}
