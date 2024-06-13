package com.gfg.finaldemo;


// This class cannot be extended (inherited by any other child class) [since marked final]
// E.g. All the wrapper classes (Integer, String, etc.) are final
public final class CompanyInfo {

    private String companyName;

    private String ceoName;

    public String companyName() {
        return "Apple";
    }

    public String getFinancialReport() {
        return "Report";
    }
}
