package com.company.Inheritance;

public class Car {

    private int seats;
    private int windows;

    public Car(){
        this.seats = 4;
        this.windows = 4;
    }

    public void start(){
        System.out.println("I start loud");
    }
    public void stop(){
        System.out.println("I stopped");
    }
    public void brake(){
        System.out.println("I put on brake");
    }
    protected int getWindows(){
        return windows;
    }
    public int getSeats(){
        return seats;
    }
}
