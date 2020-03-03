package com.moglu.patterns.abstractfactory;

public class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public PC(String RAM, String HDD, String CPU) {
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
        return "PC{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
