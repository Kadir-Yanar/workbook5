package com.dreamcar.data;

import com.dreamcar.model.Dealership;
import com.dreamcar.model.Vehicle;

import java.io.*;

public class DealershipFileManager {
    private final String FILE_NAME = "inventory.csv"; //File Name

    //This method reads dealership data from file and returns a Dealership object populated with vehicles
    public Dealership readDealership() {
       Dealership dealership=null;
    try (BufferedReader br =new BufferedReader(new FileReader(FILE_NAME))){
        String line = br.readLine(); //Read the first line which contains dealership info
        if (line==null) return null;

        // Split the first line by '|' to get dealership name, address, and phone
        String [] dealershipData =line.split("\\|");
        dealership= new Dealership(dealershipData[0],dealershipData[1],dealershipData[2]);

        while((line= br.readLine())!=null){
        String [] vehicleData = line.split("\\|");

        int vin= Integer.parseInt(vehicleData[0]);
        int year=Integer.parseInt(vehicleData[1]);
        String make= vehicleData[2];
        String model= vehicleData[3];
        String vehicleType= vehicleData[4];
        String color= vehicleData[5];
        int odometer= Integer.parseInt(vehicleData[6]);
        double price= Integer.parseInt(vehicleData[7]);

        Vehicle vehicle= new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
        dealership.addVehicle(vehicle);
        }
    } catch (IOException e) {
        System.out.println("Error reading inventory file: " + e.getMessage());
    }
    return dealership;
    }

    public void saveDealerShip(Dealership dealership){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(dealership.getDealerName()+ "|"+ dealership.getDealerAdress()+"|"+dealership.getDealerPhone());

            for (Vehicle vehicle : dealership.getAllVehicle())
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
