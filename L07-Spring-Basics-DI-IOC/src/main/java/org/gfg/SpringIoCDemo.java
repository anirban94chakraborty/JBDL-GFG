package org.gfg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCDemo {

    public static void main(String[] args) {


         // This creates a Spring application context that loads bean definitions
         // from an XML file named "projectbeans.xml" located on the classpath
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("projectbeans.xml"); // Instantiation of all the beans

        System.out.println("----------------------------");
        //--------------------------------------------------------------------------------------------------------------

        Engine engineA = applicationContext.getBean("engine1", Engine.class); // 'engine1' bean has default scope
        System.out.println("engineA : " + engineA);

        Engine engineB = applicationContext.getBean("engine1", Engine.class);  // 'engine1' bean has default scope
        System.out.println("engineB : " + engineB);

        System.out.println("engineA == engineB ? " + (engineA == engineB)); // This will be 'true' since they both refer to the same bean with default scope (singleton)
                                                                            // 'default' scope is useful for beans that are stateless and can be shared across multiple requests.

        System.out.println("----------------------------");
        //--------------------------------------------------------------------------------------------------------------

        Car car1 = applicationContext.getBean("car1", Car.class);  // 'car1' bean has default scope
        car1.runCar();

        System.out.println("----------------------------");
        //--------------------------------------------------------------------------------------------------------------

        // For 'prototype' scope, the Spring IoC container will always return a new instance of the bean when the getBean() is called.
        // The 'prototype' scope is for beans that maintain state or need to be thread-safe.

        Engine engineC = applicationContext.getBean("engine2", Engine.class); // 'engine2' bean has prototype scope
        System.out.println("engineC : " + engineC);

        Engine engineD = applicationContext.getBean("engine2", Engine.class);  // 'engine2' bean has prototype scope
        System.out.println("engineD : " + engineD);

        System.out.println("engineC == engineD ? " + (engineC == engineD)); // This will be 'false' since they both refer to different objects

        System.out.println("----------------------------");
        //--------------------------------------------------------------------------------------------------------------

        Engine engineE = applicationContext.getBean("engine3", Engine.class);
        System.out.println("engineE : " + engineE);

        // Shutdown Spring Container
        applicationContext.close(); // All beans are destroyed
    }
}
