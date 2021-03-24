package com.home.home.classes;

public class Rooms {


    private String name;
    private boolean statuslight;
    private int temperature;
    private int humidity;
    private int lighting;

    public Rooms(String name,int temperature, int humidity, int lighting) {
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
        this.lighting = lighting;
    }

    public boolean isStatuslight() {
        return statuslight;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getLighting() {
        return lighting;
    }

    public void setStatuslight(boolean statuslight) {
        this.statuslight = statuslight;
    }
    public String getName() {return name;}
}
