package com.pluralsight;

public class Jetski extends Vehicle{
    private int id;

    public Jetski(String typeOfvehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleID, int odometer, boolean isElectric, int id) {
        super(typeOfvehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleID, odometer, isElectric);
    }

}
