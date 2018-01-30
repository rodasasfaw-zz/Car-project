package com.carproject.demo;

public class CarApp {
    public static void main(String args[]){
        Car c = new Car();
        System.out.println(c.start());
        System.out.println(c.accelerate());
        c.setColor("red");
        c.setMake("porsche");
        c.setSpeed(90);
        c.getMake();
        c.getColor();
        c.getSpeed();
        System.out.println("the"+c.getColor()+c.getMake()+"is starting!");

        System.out.println("the"+c.getColor()+c.getMake()+"is starting!");



    }

}
