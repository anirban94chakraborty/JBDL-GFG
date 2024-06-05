package com.gfg;

public class InheritanceDemo {

    public static void main(String[] args) {

        // Inheritance Hierarchy: Person -> Teacher
        Teacher teacher = new Teacher("Rakesh", 30, "Maths");
        teacher.walk(); // Parent class method (overridden in child class)
        teacher.teach(); // Own class method

        /* All statements return true */
        System.out.println(teacher instanceof Teacher);
        System.out.println(teacher instanceof Person);
        System.out.println(teacher instanceof Object);

        // Casting objects (DEMO)
        Person person = new Person("Ravi", 35);
        person.walk();

        /* Casting subclass to superclass (allowed) */
        Person person1 = new Teacher("Ramesh", 40, "English");
        person1.walk();

        /* Casting superclass to subclass (not-allowed) */
        Teacher teacher1 = (Teacher) person;
        teacher1.walk(); /* Throws runtime exception (java.lang.ClassCastException) */
    }
}
