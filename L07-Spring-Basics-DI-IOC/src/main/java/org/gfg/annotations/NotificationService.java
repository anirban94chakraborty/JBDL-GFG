package org.gfg.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component annotation is used to mark a class as a bean
@Scope("prototype") // @Scope annotation is used to define the scope of a bean
public class NotificationService {

    // Field-based Dependency Injection
    @Autowired // @Autowired annotation is used to inject dependencies
    private SMSGatewayService smsGatewayService;

    // Constructor-based Dependency Injection (best approach; allows for Unit Testing)
    // No need to explicitly use @Autowired annotation for constructor-based DI
    public NotificationService(SMSGatewayService smsGatewayService) {
        System.out.println("Executing constructor");
        this.smsGatewayService = smsGatewayService;
    }

    // Setter-based Dependency Injection (allows for Unit Testing)
//    @Autowired
//    public void setSmsGatewayService(SMSGatewayService smsGatewayService) {
//        System.out.println("Executing setter");
//        this.smsGatewayService = smsGatewayService;
//    }

    public void sendNotification(String msg) {
        smsGatewayService.sendSMS(msg);
    }

}
