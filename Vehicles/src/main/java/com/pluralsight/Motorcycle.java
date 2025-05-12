package com.pluralsight;

public class Motorcycle extends Vehicle {
    private int cc;
    private String motorcycleType;
    private boolean hasPassengerCar;


    public Motorcycle(String typeOfvehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleID, int odometer, boolean isElectric) {
        super(typeOfvehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleID, odometer, isElectric);
    }
}
