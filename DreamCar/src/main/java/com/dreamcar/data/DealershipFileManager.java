package com.dreamcar.data;

import com.dreamcar.model.Dealership;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    private final String FILE_NAME = "inventory.csv";

    public Dealership getDealership() {
       Dealership dealership=null;
    try {BufferedReader br =new BufferedReader(new FileReader(FILE_NAME)){
        String line = br.readLine();
    }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    return dealership;
    }
}
