package org.gfg.didemo;

import java.util.ArrayList;
import java.util.List;

public class JobListingService {

    private TranslationService translationService;

    public JobListingService() {
        translationService = new TranslationService();
    }

    public JobListingService(TranslationService translationService) {
        this.translationService = translationService;
    }

    List<String> getAllJobsByKeyword(String key) {
        List<String> result = new ArrayList<>();
        // Call to DB
        // To Translation Service
        result = translationService.translate(result);
        return result;
    }
}
