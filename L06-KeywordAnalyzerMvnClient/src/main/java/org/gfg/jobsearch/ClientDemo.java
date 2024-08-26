package org.gfg.jobsearch;

import org.gfg.keywords.keywordanalyzer.KeywordAnalyzerImpl;
import org.gfg.keywords.keywordanalyzer.KeywordAnalyzerInterface;
import org.gfg.keywords.keywordanalyzer.NewMvnImp;

public class ClientDemo {

    public static void main(String[] args) {
        //KeywordAnalyzerInterface keywordAnalyzerInterface = new KeywordAnalyzerImpl();
        KeywordAnalyzerInterface keywordAnalyzerInterface = new NewMvnImp();
    }
}
