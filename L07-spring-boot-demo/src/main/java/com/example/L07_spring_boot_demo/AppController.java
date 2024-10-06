package com.example.L07_spring_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/hello")
    public String getHello() {
        return "Hello from: " + Thread.currentThread().getName();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/testUrl")
    public String getIndigoUrl() {
        return flightSearchService.callIndigoAPI();
    }
}
