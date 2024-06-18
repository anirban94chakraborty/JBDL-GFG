package com.gfg.abstractclassandinterfacedemo;

public class AbstractClassAndInterfaceDemo {

    public static void main(String[] args) {
        System.out.println(InterfaceDemo.companyName);  // Valid
        // InterfaceDemo.companyName = "Apple";  // Invalid (as variables defined in interface are static by default)

        ConcreteClass concreteClass = new ConcreteClass();
        System.out.println(concreteClass.getData());  /* Abstract class's getData() method will be called
                                     instead of the Interface's getData() method
                                     since class methods are considered to be more concrete */
    }
}
//-------------------------------------------------------------------------
interface InterfaceDemo {
    String companyName = "GFG";  // By default, this variable is 'public','static', and 'final'

    default String getData() {
        return "Getting Data from InterfaceDemo";
    }
}
//-------------------------------------------------------------------------
abstract class AbstractClass {

    private String data;

    public String getData() {
        return "Getting Data from Abstract Class";
    }

    private String getDataInternal() {
        return "";
    }

    public abstract String getDetails();
}
//------------------------------------------------------------------------
class ConcreteClass extends AbstractClass implements InterfaceDemo{
    @Override
    public String getDetails() {
        return null;
    }
}