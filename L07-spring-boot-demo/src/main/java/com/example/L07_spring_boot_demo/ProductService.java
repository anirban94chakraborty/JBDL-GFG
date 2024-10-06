package com.example.L07_spring_boot_demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    private Map<Long, Product> productMap;

    @PostConstruct
    public void initMethod() {
        productMap = new HashMap<>();
        productMap.put(1L, new Product(1L, "Laptop", 50000.0));
        productMap.put(2L, new Product(2L, "Mouse", 500.00));
        productMap.put(3L, new Product(3L, "Keyboard", 1000.00));
    }

    public Product getProductById(Long id) {
        return productMap.get(id);
    }
}
