package com.gfg.singletondemo;

public class SingletonDemo {

    public static void main(String[] args) {

//        SingletonClass obj1 = new SingletonClass();
//        SingletonClass obj2 = new SingletonClass();

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        System.out.println(obj1 == obj2);

    }
}

/*
   Singleton Class - A class which can have only one instance (object)
*/
class SingletonClass {
    private String data;

    // Requirement #1: A static field which holds the single instance reference
    private static SingletonClass instance;

    // Requirement #2: Private Constructor
    private SingletonClass() { }

    // Requirement #3: Public method for getting instance reference
    public static SingletonClass getInstance() {
        if(instance == null)
            instance = new SingletonClass();
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
