package com.gfg.abstractiondemo;

import com.gfg.interfacedemo.IndGovtNormsForCar;
import com.gfg.interfacedemo.TataCar;
import com.gfg.interfacedemo.TataTiago;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Data Output"); // The implementation of println is abstracted

        List<Integer> list = new ArrayList<>();
        list.add(10);    // Implementation of add method is abstracted in the 'ArrayList' class
        list.add(-2);
        list.add(20);
        list.add(7);
        list.add(1);

        System.out.println(list);
        Collections.sort(list);  // The sorting mechanism is abstracted in the 'Collections' utility class
        System.out.println(list);

        // TataCar tataCar = new TataCar();  // Invalid (since 'TataCar' is an abstract class)
        TataCar tataCar = new TataTiago();  /* Valid (reference variables of abstract class type is allowed with
                                                      values as concrete child class objects) */

        // IndGovtNormsForCar indGovtNormsForCar = new IndGovtNormsForCar(); // Invalid (since 'IndGovtNormsForCar' is an interface)
        // IndGovtNormsForCar indGovtNormsForCar = new TataCar(); // Invalid (since 'TataCar' is an abstract class
        IndGovtNormsForCar indGovtNormsForTataCar = new TataTiago(); /* Valid  (reference variables of interface type is allowed with
                                                                                values as implementing concrete child class objects) */

    }
}
