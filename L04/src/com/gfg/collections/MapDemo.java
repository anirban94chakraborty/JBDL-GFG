package com.gfg.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("bacth", "JBDL-72");
        map.put("mentor", "Shashi");
        System.out.println(map);

        System.out.println("----------------------");
        //--------------------------------------------------------------------

        Map<Integer, Product> productMap = new HashMap<>();
        Product product1 = new Product("Laptop", 50000.00, 4);
        Product product2 = new Product("Pen", 50.00, 5);
        Product product3 = new Product("Mouse", 500.00, 1);
        Product product4 = new Product("Monitor", 10000.00, 3);

        productMap.put(21, product1);
        productMap.put(32, product2);
        productMap.put(43, product3);
        System.out.println(productMap);
        System.out.println("----------");
        productMap.put(43, product4);
        System.out.println(productMap);

        System.out.println("----------");
        System.out.println(productMap.get(32)); // Fetch Value by Key
        System.out.println("----------");

        // Map Iteration
        for(Integer key: productMap.keySet()) {
            System.out.println(productMap.get(key));
        }

        System.out.println("-----------");
        for(Product product: productMap.values()) {
            System.out.println(product);
        }
    }
}
/*
DSA
- Total hits on a Website country-wise
- API Rate Limiter
- Find Frequency of all characters in a String or Sentence
 */