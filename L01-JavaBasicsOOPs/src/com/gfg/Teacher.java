package com.gfg;

public class Teacher extends Person{

    private String subject;

    public Teacher(String name, Integer age, String subject) {
        super(name, age); // Call to parent class constructor (required)
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println(super.getName() + " is teaching " + subject);
    }

    @Override
    public void walk() {
        System.out.println("Teacher " + getName() + " is walking");
    }

}
