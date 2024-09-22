package org.gfg.didemo;

import java.util.List;

public class DependencyInjectionDemo {

    public static void main(String[] args) {

        // Approach #1 : Creating Two Separate Objects of TranslationService in both 'JobListingService'
        //               and 'JobDetailService' classes
        //               [This is an example of Tight Coupling]
        JobListingService jobListingService = new JobListingService();
        List<String> jobs = jobListingService.getAllJobsByKeyword("java");

        JobDetailService jobDetailService = new JobDetailService();
        String jobDetails = jobDetailService.getJobDetails(134l);

        //----------------------------------------------------------------------------------------------

        // Approach #2 : Creating only one instance of TranslationService and using it in both
        //               'JobListingService' and 'JobDetailService' classes
        //               [This is an example of Loose Coupling -> achieved through 'Dependency Injection' via constructor]
        TranslationService translationService = new TranslationService();

        JobListingService jobListingService1 = new JobListingService(translationService);
        List<String> jobs1 = jobListingService1.getAllJobsByKeyword("java");

        JobDetailService jobDetailService1 = new JobDetailService(translationService);
        String jobDetails1 = jobDetailService1.getJobDetails(134l);

    }
}
