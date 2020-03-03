package com.moglu.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temp,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
