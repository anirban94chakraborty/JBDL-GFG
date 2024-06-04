package com.gfg;

import java.util.Date;

public class ImmutabilityDemo {


    public static void main(String[] args) {
        String name = new String("Shashi");

        String name2 = name; // name2 now refers to the same String object referred by 'name'

        // Both 'name' and 'name2' refer to the same String object with value "Sashi"
        System.out.println(name); // Sashi
        System.out.println(name2); // Sashi

        // 'name2' now refer to a new String object with value "Ravi"
        name2 = new String("Ravi");

        name.substring(0,3); // No change to the String value

        // Different values are printed
        System.out.println(name); // Sashi
        System.out.println(name2); // Ravi

        //=====================================================================================
        Date date1 = new Date();

        Employee emp1 = new Employee("Emp1", date1);
        System.out.println(emp1);

        date1.setTime(784520000); // Original value of 'doj' of 'emp1' object is not modified
        emp1.getDoj().setTime(8950044); // Original Value is 'doj' of 'emp1' object is not modified

        System.out.println(emp1);
    }

}
