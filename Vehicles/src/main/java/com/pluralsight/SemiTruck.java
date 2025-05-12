package com.pluralsight;

public class SemiTruck extends Vehicle{
    private int maxLoadBearing;
    private int numberOfTrailers;
    private int numberOfWheels;
    private boolean hasSleepingCabin;

    public SemiTruck(String typeOfvehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleID, int odometer, boolean isElectric) {
        super(typeOfvehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleID, odometer, isElectric);
    }
}
