package com.gfg.exceptions;

import java.util.List;

public class SearchService {

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        List<Product> data = null;

        try {
            data = productService.getProduct("Laptop"); // This will throw an exception
            System.out.println("Close all resources"); // So, this statement will not get executed
        } catch (ProductNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Close all resources using the finally block");
        }

        System.out.println(data);
    }
}
