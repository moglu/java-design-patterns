package com.moglu.patterns.strategy;

public class App {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = ReportGeneratorFactory.getReportGenerator(CustomerOrigin.US);
        reportGenerator.generate();
    }
}
