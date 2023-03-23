package edu.sdccd.cisc191;

import java.io.Serializable;
import java.util.Arrays;
public class VehicleResponse implements Serializable {
    private VehicleRequest request;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private int numberOfDoors;
    private String[] options;

    // Constructor for the VehicleResponse class, initializes all fields
    public VehicleResponse(VehicleRequest request, int milesOnVehicle, int price,
                           int numberOfSeats, int numberOfDoors, String[] options) {
        this.request = request;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.options = options;
    }

    // Getters and setters for all fields
    /*public VehicleRequest getRequest() {
        return request;
    }

    public void setRequest(VehicleRequest request) {
        this.request = request;
    }

    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    public void setMilesOnVehicle(int milesOnVehicle) {
        this.milesOnVehicle = milesOnVehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }*/

    // toString method for a readable representation of the VehicleResponse object
    @Override
    public String toString() {
        return "Vehicle Details:\n" +
                "Year: " + request.getYear() + "\n" +
                "Make: " + request.getMake() + "\n" +
                "Model: " + request.getModel() + "\n" +
                "Miles on Vehicle: " + milesOnVehicle + "\n" +
                "Price: $" + price + "\n" +
                "Number of Seats: " + numberOfSeats + "\n" +
                "Number of Doors: " + numberOfDoors + "\n" +
                "Options: " + Arrays.toString(options);
    }
}