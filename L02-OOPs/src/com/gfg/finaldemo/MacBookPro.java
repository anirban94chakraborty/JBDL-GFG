package com.gfg.finaldemo;

public class MacBookPro extends MacBook{

    @Override
    public String getProcessor() {
        return "M1 Pro";
    }

    // Cannot override the companyName() method (since method is declared 'final' in parent class)

    //    @Override
    //    public String companyName() {
    //        return "Apple Inc.";
    //    }
}
