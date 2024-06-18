package com.gfg.serializationdemo;

import java.util.Date;

public class TransientDemo {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
    }
}

class Employee {

    private String name;

    private Date doj;

    private transient Long serviceDuration; // This field (which holds derived data) will not be added during serialization

    public Employee() {
    }
}