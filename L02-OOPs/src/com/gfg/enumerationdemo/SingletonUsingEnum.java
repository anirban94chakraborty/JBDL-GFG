package com.gfg.enumerationdemo;

public class SingletonUsingEnum {

    public static void main(String[] args) {
        // Creation of new object is not possible
        // SingletonClassEnum singletonClassEnum = new SingletonClassEnum();

        // However, the single instance of the enum can be used
        SingletonClassEnum singletonClassEnum = SingletonClassEnum.SingleObject;

        System.out.println(singletonClassEnum.getData());
    }
}

enum SingletonClassEnum {

    SingleObject("testData");

    private String data;

    private SingletonClassEnum(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
