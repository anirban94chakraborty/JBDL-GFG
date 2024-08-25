package com.gfg.keywordanalyzer;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FreqKeywordAnalyzerImpl implements KeywordAnalyzerInterface{

    // private Map<String,Integer> dataStore = new HashMap<>();
    private Map<String, Integer> dataStore = new TreeMap<>();

    @Override
    public void recordKeyword(String keyword) {
        if(dataStore.containsKey(keyword)) {
            dataStore.put(keyword, dataStore.get(keyword) + 1);
        } else {
            dataStore.put(keyword, 1);
        }
    }

    @Override
    public List<String> getKeywords() {
        return dataStore.keySet().stream().toList();
    }

    @Override
    public Map<String, Integer> getKeywordWithFreq() {
        return dataStore;
    }
}
