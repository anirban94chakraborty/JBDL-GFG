package com.gfg.objectclassdemo;

import java.util.Objects;

public class Laptop {

    private String os;

    private String processor;

    public Laptop(String os, String processor) {
        this.os = os;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
