package com.gfg.objectclassdemo;


import com.gfg.staticdemo.CompanyLogo;

public class Laptop {

    public static CompanyLogo companyLogoAtClass = new CompanyLogo();

    public static long laptopCount = 0L;

    public static String designData() {
        return "Design Data";
    }

    // Static block (executes before the creation of any new objects)
    static
    {
        System.out.println("Executing static block in Laptop class");
    }

    private String os;

    private String processor;

    public Laptop(String os, String processor) {
        this.os = os;
        this.processor = processor;
        laptopCount++;
    }

    public void start() {
        System.out.println("Starting " + os);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
