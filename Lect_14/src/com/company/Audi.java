package com.company;

public class Audi extends Car{
    private int windows;
    private int seats;


    public Audi(){
        this.windows=5;
        this.seats = 6;
    }
    public int getSeats(){
        return super.getSeats();
    }
    public int getWindows(){
        return windows;
    }
}
