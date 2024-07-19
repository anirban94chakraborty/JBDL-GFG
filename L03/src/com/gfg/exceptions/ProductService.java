package com.gfg.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> getProduct(String keyword) throws ProductNotFoundException {

        if(keyword == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        // Call to DB
        System.out.println("Calling DB");
        List<Product> list = new ArrayList<>();
        if(list.isEmpty()) {
            throw new ProductNotFoundException("No product for keyword: " + keyword);
        }
        return list;
    }
}
