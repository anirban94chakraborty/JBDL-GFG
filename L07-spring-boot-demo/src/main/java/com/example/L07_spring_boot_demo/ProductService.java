package com.example.L07_spring_boot_demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {

    private Map<Long, Product> productMap;
    private AtomicLong nextId = new AtomicLong(1l);

    @PostConstruct
    public void initMethod() {
        productMap = new HashMap<>();
        productMap.put(nextId.getAndIncrement(), new Product(1L, "Laptop", 50000.0));
        productMap.put(nextId.getAndIncrement(), new Product(2L, "Mouse", 500.00));
        productMap.put(nextId.getAndIncrement(), new Product(3L, "Keyboard", 1000.00));
    }

    public Product getProductById(Long id) {
        return productMap.get(id);
    }

    public Product createProduct(Product product) {
        product.setId(nextId.getAndIncrement());
        productMap.put(product.getId(), product);
        return product;
    }
}
