package org.gfg.keywords.keywordanalyzer;

public class Demo {

    public static void main(String[] args) {

        // KeywordAnalyzerInterface keywordAnalyzer = new DummyImpl();
        // KeywordAnalyzerInterface keywordAnalyzer = new KeywordAnalyzerImpl();
        // KeywordAnalyzerInterface keywordAnalyzer = new UniqueKeywordAnalyzerImpl();
        // KeywordAnalyzerInterface keywordAnalyzer = new FreqKeywordAnalyzerImpl();
        KeywordAnalyzerInterface keywordAnalyzer = new KeywordAnalyzerWithFreq();

        keywordAnalyzer.recordKeyword("lap2top");
        keywordAnalyzer.recordKeyword("laptop");
        keywordAnalyzer.recordKeyword("mobile");
        keywordAnalyzer.recordKeyword("phone");
        keywordAnalyzer.recordKeyword("mobile");
        keywordAnalyzer.recordKeyword("phone");
        keywordAnalyzer.recordKeyword("Acer Laptop");

        System.out.println(keywordAnalyzer.getKeywords());
        System.out.println(keywordAnalyzer.getKeywordWithFreq());
        System.out.println(keywordAnalyzer.getKeywordFreqOrderByFreq());
    }
}
