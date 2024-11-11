package com.example.L08_Logging_MVC_demo;

import org.gfg.keywords.keywordanalyzer.KeywordAnalyzerImpl;
import org.gfg.keywords.keywordanalyzer.KeywordAnalyzerInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public KeywordAnalyzerInterface getKeywordAnalyzer() {
        return new KeywordAnalyzerImpl();
    }
}
