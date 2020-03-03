package com.moglu.patterns.strategy;

public class ReportGeneratorFactory {
    public static ReportGenerator getReportGenerator(CustomerOrigin customerOrigin){
        ReportGenerator reportGenerator = null;
        if(customerOrigin==CustomerOrigin.US){
            reportGenerator = new USReportGenerator();
        }
        else if(customerOrigin==CustomerOrigin.UK){
            reportGenerator = new UKReportGenerator();
        }
        return reportGenerator;
    }
}
