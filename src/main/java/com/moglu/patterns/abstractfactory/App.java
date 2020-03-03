package com.moglu.patterns.abstractfactory;

public class App {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB","2.4Ghz","500GB"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("32GB","5TB","5Ghz"));

        System.out.println(pc);
        System.out.println(server);
    }
}
