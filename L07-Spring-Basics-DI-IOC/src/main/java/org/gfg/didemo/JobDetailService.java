package org.gfg.didemo;

import java.util.ArrayList;
import java.util.List;

public class JobDetailService {

    private TranslationService translationService;

    public JobDetailService() {
        translationService = new TranslationService();
    }

    public JobDetailService(TranslationService translationService) {
        this.translationService = translationService;
    }

    String getJobDetails(Long id) {
        List<String> result = new ArrayList<>();
        // Call to DB
        // To Translation Service
        result = translationService.translate(result);
        return result.get(1);
    }
}
