package com.dreamcar.model;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String dealerName;
    private String dealerAdress;
    private String dealerPhone;
    private ArrayList<Vehicle> inventory;

    //Constructor

    public Dealership(String dealerName, String dealerAdress, String dealerPhone) {
        this.dealerName = dealerName;
        this.dealerAdress = dealerAdress;
        this.dealerPhone = dealerPhone;
        this.inventory = new ArrayList<>();
    }

    // Getters
    public String getDealerName() {
        return dealerName;
    }

    public String getDealerAdress() {
        return dealerAdress;
    }

    public String getDealerPhone() {
        return dealerPhone;
    }
    public List<Vehicle> getVehiclesByPrice(double minPrice, double MaxPrice) {
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int minYear, int maxYear) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public void  removeVehicle(Vehicle vehicle) {
        // Method intentionally left empty
    }

    public List<Vehicle> getAllList(){
        return inventory;
    }
}
