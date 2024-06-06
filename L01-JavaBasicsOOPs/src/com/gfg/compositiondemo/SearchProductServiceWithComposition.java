package com.gfg.compositiondemo;

import java.util.ArrayList;
import java.util.List;

public class SearchProductServiceWithComposition {

    // Using composition instead of inheritance:

    private SortingAlgoInterface sortingAlgo;   // for using the sort method of a Sorting Algo class
    private FormattingService formattingService; // for using the format method of the FormattingService class


    // Tightly coupled
    public SearchProductServiceWithComposition() {
        this.sortingAlgo = new MergeSortAlgo();
        this.formattingService = new FormattingService();
    }

    // Loosely coupled
    public SearchProductServiceWithComposition(SortingAlgoInterface sortingAlgo) {
        this.sortingAlgo = sortingAlgo;
        this.formattingService = new FormattingService();
    }

    public List<String> search(String keyword) {
        /*
            Fetch from DB
         */
        List<String> products = new ArrayList<>();
        // Sorting
        sortingAlgo.sort(products);
        formattingService.format(products);
        return products;
    }
}
