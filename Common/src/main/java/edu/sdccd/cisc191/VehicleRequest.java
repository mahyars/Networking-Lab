package edu.sdccd.cisc191;

import java.io.Serializable;

public class VehicleRequest implements Serializable {
    private int year;
    private String make;
    private String model;

    // Constructor for the VehicleRequest class, initializes year, make, and model
    public VehicleRequest(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // toString method for a readable representation of the VehicleRequest object
    @Override
    public String toString() {
        return "VehicleRequest{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}