package com.pluralsight;

public class Car extends Vehicle{

    private int numberOfDoors;
    private int safetyRating;
    private String carType;

    public Car(String typeOfvehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleID, int odometer, boolean isElectric) {
        super(typeOfvehicle, vehicleMake, vehicleModel, passengerCount, cargoCapacity, fuelCapacity, travelRange, vehicleYearMade, vehicleID, odometer, isElectric);
    }

    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }
    public void setSafetyRating(int safetyRating) { this.safetyRating = safetyRating; }
    public void setCarType(String carType) { this.carType = carType; }




}
