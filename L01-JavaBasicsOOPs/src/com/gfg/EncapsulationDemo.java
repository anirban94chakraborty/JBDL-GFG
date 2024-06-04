package com.gfg;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Lecture l1 = new Lecture();
        l1.setName("L01");
        l1.setMentor("Shashi");
        l1.setStatus("Upcoming");

        System.out.println(l1);
        l1.getName();

        l1.setName("Lecture-01");
        System.out.println(l1);
    }
}
