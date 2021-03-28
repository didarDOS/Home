package com.home.home.models;

import android.widget.ImageView;

public class Rooms {


    private String name;
    private int image;
    private boolean statuslight;
    private int temperature;
    private int humidity;
    private int lighting;


    public Rooms(String name,int temperature, int humidity, int lighting, int image) {
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
        this.lighting = lighting;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {return name;}
}
