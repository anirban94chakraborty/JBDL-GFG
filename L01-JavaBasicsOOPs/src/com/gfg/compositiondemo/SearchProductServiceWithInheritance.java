package com.gfg.compositiondemo;

import java.util.ArrayList;
import java.util.List;

public class SearchProductServiceWithInheritance extends MergeSortAlgo{

    public List<String> search(String keyword) {
        /*
            Fetch Data From DB
        */

        List<String> products = new ArrayList<>();
        sort(products); // Using the sort method defined in the MergeSortAlgo class (through Inheritance)
        return null;
    }
}
