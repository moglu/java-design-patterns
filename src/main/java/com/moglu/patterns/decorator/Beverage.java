package com.moglu.patterns.decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public enum Size{TALL, GRANDE, VENTI};

    Size size;

    public String getDescription() {
        return description;
    }

    public abstract  double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
