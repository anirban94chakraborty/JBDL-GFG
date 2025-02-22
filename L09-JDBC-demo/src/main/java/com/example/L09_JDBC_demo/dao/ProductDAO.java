package com.example.L09_JDBC_demo.dao;

import com.example.L09_JDBC_demo.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductDAO implements ProductDAOInterface{

    private Map<Long, Product> dataStore = new HashMap<>();
    private AtomicLong nextId = new AtomicLong(1l);

    public Product getById(Long id) {
        // Call DB
        return dataStore.get(id);
    }

    public Product create(Product product) {
        product.setId(nextId.getAndIncrement());
        dataStore.put(product.getId(), product);
        return product;
    }

    public Product update(Long id, Product product) {
        Product existingProduct = dataStore.get(id);
        if(existingProduct == null) {
            return null;
        }
        existingProduct.setName(product.getName());
        existingProduct.setCost(product.getCost());
        return existingProduct;
    }

    public Product delete(Long id) {
        Product existingProduct = dataStore.get(id);
        if(existingProduct == null) {
            return null;
        }
        dataStore.remove(id);
        return existingProduct;
    }
}
