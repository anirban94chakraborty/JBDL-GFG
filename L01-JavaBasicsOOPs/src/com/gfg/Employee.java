package com.gfg;

import java.util.Date;

// Immutable class example
public final class Employee {

    private final String name;
    private final Date doj;

    public Employee(String name, Date doj) {
        this.name = name;
        this.doj = new Date(doj.getTime()); // To make the doj value immutable
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        // return doj; -> This is not preferred as Date is not immutable and the value of doj can be changed using
        //                getDoj.setTime()
        return new Date(doj.getTime());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                '}';
    }
}
