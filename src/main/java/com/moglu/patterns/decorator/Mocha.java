package com.moglu.patterns.decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()){
            case TALL:
                cost+=.10;
                break;
            case GRANDE:
                cost+=.15;
                break;
            case VENTI:
                cost+=.20;
                break;
        }
        return cost;
    }
}
