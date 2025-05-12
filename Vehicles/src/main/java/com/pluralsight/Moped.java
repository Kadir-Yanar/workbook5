package com.pluralsight;

public class Moped extends Vehicle{
    private String mopedSize;
    private String mopedType;


    public Moped(String typeOfvehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleID, int odometer, boolean isElectric) {
        super(typeOfvehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleID, odometer, isElectric);
    }
}
