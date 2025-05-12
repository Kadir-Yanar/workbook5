package com.pluralsight;

public class Vehicle {
    protected String typeOfvehicle;
    protected String vehicleMake;
    protected String vehicleModel;
    protected int passengerCount;
    protected int cargoCapacity;
    protected int fuelCapacity;
    protected int travelRange;
    protected int vehicleYearMade;
    protected String vehicleID;
    protected int odometer;
    protected boolean isElectric;

    public Vehicle(String typeOfvehicle, String vehicleMake, String vehicleModel, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleID, int odometer, boolean isElectric) {
        this.typeOfvehicle = typeOfvehicle;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.passengerCount = passengerCount;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.travelRange = travelRange;
        this.vehicleYearMade = vehicleYearMade;
        this.vehicleID = vehicleID;
        this.odometer = odometer;
        this.isElectric = isElectric;
    }

    public String getTypeOfvehicle() {
        return typeOfvehicle;
    }

    public void setTypeOfvehicle(String typeOfvehicle) {
        this.typeOfvehicle = typeOfvehicle;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getTravelRange() {
        return travelRange;
    }

    public void setTravelRange(int travelRange) {
        this.travelRange = travelRange;
    }

    public int getVehicleYearMade() {
        return vehicleYearMade;
    }

    public void setVehicleYearMade(int vehicleYearMade) {
        this.vehicleYearMade = vehicleYearMade;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
