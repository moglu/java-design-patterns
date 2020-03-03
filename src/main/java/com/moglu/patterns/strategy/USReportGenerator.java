package com.moglu.patterns.strategy;

public class USReportGenerator implements ReportGenerator{
    public void generate() {
        //Some business logic for generating PDF
        System.out.println("US Report Generated");
    }
}
