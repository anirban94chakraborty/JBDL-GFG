package com.gfg.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> studentsSet = new HashSet<>();
        studentsSet.add("Neeraj");
        studentsSet.add("Deeraj");
        studentsSet.add("Neeraj");
        studentsSet.add("Deeraj");
        System.out.println(studentsSet);
    }
}
