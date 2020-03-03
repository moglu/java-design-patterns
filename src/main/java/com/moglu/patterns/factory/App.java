package com.moglu.patterns.factory;

public class App {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2GB","500GB","2.4Ghz");
        System.out.println(pc);
    }
}
