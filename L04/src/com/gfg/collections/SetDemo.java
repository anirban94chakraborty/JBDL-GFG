package com.gfg.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> studentsSet = new HashSet<>();
        studentsSet.add("Neeraj");
        studentsSet.add("Deeraj");
        studentsSet.add("Neeraj");
        studentsSet.add("Deeraj");
        System.out.println(studentsSet);
        System.out.println(studentsSet.size());
        System.out.println("---------------------------------");
        //----------------------------------------------------------------
        Product product1 = new Product("Laptop", 50000.00, 4);
        Product product2 = new Product("Pen", 50.00, 5);
        Product product3 = new Product("Mouse", 500.00, 1);
        Product product4 = new Product("Mouse", 500.00, 1);

        Set<Product> productSet = new HashSet<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);
        System.out.println(product3.equals(product4));  /* Returns true if equals() method implementation of Product
                                                           compares all the three values of name, cost and rating
                                                           as equal; otherwise false
                                                         */
        System.out.println(productSet.size()); /* Return 4 if the hashCode() method of Product does not return the same
                                                  hashcode for product3 and product4 objects;
                                                  For storing in a 'Set' container, only new objects with duplicate
                                                  hashCode will be discarded
                                                  [Objects that are 'equal' have to return identical hashcodes to be
                                                   considered as SAME/DUPLICATE]
                                                */
    }
}
/*
DSA
- Finding Unique Visitors
- Check if username already exists
 */