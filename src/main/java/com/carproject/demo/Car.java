package com.carproject.demo;


public class Car extends Vehicle{
    private String color;
    private String make;
    public int speed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMake() {

        return make;

    }
}
