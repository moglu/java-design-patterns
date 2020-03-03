package com.moglu.patterns.strategy;

public class UKReportGenerator implements ReportGenerator{
    TableGeneratingStrategy tableGeneratingStrategy;

    public UKReportGenerator() {
        this.tableGeneratingStrategy = TableGeneratingStrategyResolver.resolveTableGeneratingStrategy(TableType.TYPE1);
    }

    public void generate() {
        //Some business logic for generating PDF
        System.out.println("UK Report Generated");
    }
}
