package com.gfg.compositiondemo;

import java.util.ArrayList;
import java.util.List;

public class SearchProductServiceWithInheritance extends MergeSortAlgo{

    // Method Overloading
    public List<String> search(String keyword) {
        /*
            Fetch Data From DB
        */
        List<String> products = new ArrayList<>();
        sort(products);
        return null;
    }

    // Method Overloading
    public List<String> search(String keyword, List<String> filters) {
        /*
            Fetch Data From DB
        */
        List<String> products = new ArrayList<>();
        sort(products);
        return null;
    }
}
