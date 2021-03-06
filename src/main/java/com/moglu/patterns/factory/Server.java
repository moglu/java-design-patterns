package com.moglu.patterns.factory;

public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String RAM, String HDD, String CPU) {
        this.ram = RAM;
        this.hdd = HDD;
        this.cpu = CPU;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
