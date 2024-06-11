package com.gfg.objectclassdemo;

public class ObjectClassDemo {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Ubuntu", "i5 8th Gen");
        Laptop laptop2 = new Laptop("Ubuntu", "i5 8th Gen");
        Laptop laptop3 = laptop1;

        System.out.println(laptop1);
        System.out.println(laptop2);

        System.out.println(laptop1.equals(laptop2));  // False (different references)
        System.out.println(laptop1.equals(laptop3));  // True (same reference)

        //---------------------------------------------------------------------

        String data1 = new String("Chair");
        String data2 = new String("Chair");
        System.out.println(data1.equals(data2)); // True, since String class overrides the equals() method of Object class
        System.out.println(data1 == data2); // False, since references are compared
    }
}
