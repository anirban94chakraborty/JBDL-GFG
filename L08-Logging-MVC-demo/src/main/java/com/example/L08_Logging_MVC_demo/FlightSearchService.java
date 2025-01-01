package com.example.L08_Logging_MVC_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FlightSearchService {

    @Value("${indigo.url:abc}") // Here 'abc' is a default value to be used in case the property is not found
    private String indigoUrl;

    private String callIndigoAPI() {
        // indigoUrl
        return indigoUrl;
    }
}
