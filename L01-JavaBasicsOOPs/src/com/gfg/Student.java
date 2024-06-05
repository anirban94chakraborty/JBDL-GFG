package com.gfg;

import java.util.List;

public class Student extends Person {

    private List<String> subjects;

    public Student(String name, Integer age, List<String> subjects) {
        super(name, age);
        this.subjects = subjects;
    }
}
