package org.gfg.keywords.keywordanalyzer;

import java.util.List;

public class DummyImpl implements KeywordAnalyzerInterface{

    @Override
    public void recordKeyword(String keyword) {

    }

    @Override
    public List<String> getKeywords() {
        return List.of();
    }
}
