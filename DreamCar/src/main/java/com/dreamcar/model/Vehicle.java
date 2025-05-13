package com.dreamcar.model;

import java.util.Stack;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicLeType;
    private String color;
    private int odometer;
    private double price;

    //Constructor
    public Vehicle(int vin, int year, String make, String vehicLeType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model=model;
        this.vehicLeType = vehicLeType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getVehicLeType() {
        return vehicLeType;
    }

    public void setVehicLeType(String vehicLeType) {
        this.vehicLeType = vehicLeType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return vin + " | " + year + " " + make + " " + model + " | " + vehicLeType + " | " + color + " | " + odometer + " miles | $" + price;
    }
}
