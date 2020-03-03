package com.moglu.patterns.strategy;

public class TableGeneratingStrategyResolver {
    public static TableGeneratingStrategy resolveTableGeneratingStrategy(TableType type){

        switch (type){
            case TYPE1:
                return new TableGeneratingStrategy1();
            case TYPE2:
                return new TableGeneratingStrategy2();
            case TYPE3:
                return new TableGeneratingStrategy3();
            default:
                return new DefaultTableGeneratingStrategy();
        }

    }
}
