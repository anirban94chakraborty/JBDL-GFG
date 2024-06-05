package com.paytm;

import com.gfg.Employee;

import java.util.Date;

public class DefaultDemo {

    public static void main(String[] args) {
        Employee employee = new Employee("Test", new Date());

        /* Class members with default scope cannot be accessed (because of different package):
             employee.details = "Test emp";
             System.out.println(employee.details);
         */

        System.out.println(employee);
    }
}
