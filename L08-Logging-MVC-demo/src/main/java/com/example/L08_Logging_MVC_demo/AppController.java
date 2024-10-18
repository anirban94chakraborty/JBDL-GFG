package com.example.L08_Logging_MVC_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
