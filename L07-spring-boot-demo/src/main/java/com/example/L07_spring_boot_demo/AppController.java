package com.example.L07_spring_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private ProductService productService;

    @Autowired
    private FlightSearchService flightSearchService;

    @GetMapping
    public String getAppInfo() {
        return "Hello from: L07 app";
    }

    /* Sending Data in Request using Request Parameters / Query Parameters */
    @GetMapping("/hello")
    public String getHello(@RequestParam(required = false, name = "nm", defaultValue = "Sample") String name) {
        return "Hello! " + name + " from: " + Thread.currentThread().getName();
    }

    /* Sending Data in Request using Path Parameters */
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    /* Sending Data in Request using Request Body */
    @PostMapping("createProduct")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/testUrl")
    public String getIndigoUrl() {
        return flightSearchService.callIndigoAPI();
    }
}
