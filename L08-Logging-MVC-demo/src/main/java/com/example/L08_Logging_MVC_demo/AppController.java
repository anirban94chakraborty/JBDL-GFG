package com.example.L08_Logging_MVC_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {

    private static Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @GetMapping
    public String hello(@RequestParam String name) {
        LOGGER.info("Processing hello API for data: {}", name);
        LOGGER.error("Some error");
        LOGGER.warn("Some warning");
        LOGGER.debug("Some debug");
        return "Hello " + name + " from: " + Thread.currentThread().getName();
    }

    @GetMapping("productList")
    public List<Product> getList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1l, "Mouse", 5000.00));
        productList.add(new Product(2l, "Keyboard", 6000.00));
        productList.add(new Product(3l, "Monitor", 7000.00));
        ModelAndView modelAndView = new ModelAndView("dynamic-page.html");
        modelAndView.getModelMap().put("products", productList);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        modelAndView.getModelMap().put("serverTime", dateFormat.format(new Date()));
        return productList;
    }
}
