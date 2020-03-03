package com.moglu.patterns.observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private float minTemp;
    private float maxTemp;

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Display: " + temp + " F degrees and " + humidity +  "% humidity" );
        System.out.println("Min/Avg/Max" + minTemp  + "/" + temp + "/" + maxTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        minTemp = temp -1;
        maxTemp = temp + 1;
        display();
    }
}
