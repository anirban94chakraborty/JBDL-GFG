package org.gfg.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.gfg.annotations");
        NotificationService notificationService1 = applicationContext.getBean("notificationService", NotificationService.class);
        NotificationService notificationService2 = applicationContext.getBean("notificationService", NotificationService.class);
        System.out.println("notificationService1 == notificationService2 ? " + (notificationService1 == notificationService2)); // Result depends on the scope of the bean
        notificationService2.sendNotification("OTP:8909");
    }
}
