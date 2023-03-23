package edu.sdccd.cisc191.client;

import edu.sdccd.cisc191.VehicleRequest;
import edu.sdccd.cisc191.VehicleResponse;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Connect to the server using its hostname and port number
        String host = "localhost";
        int port = 8080;
        try (Socket socket = new Socket(host, port);
             // Create ObjectOutputStream to send and receive serialized objects to the server
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {

            // Create a VehicleRequest object and send it to the server
            VehicleRequest request = new VehicleRequest(2020, "Toyota", "Camry");
            oos.writeObject(request);
            oos.flush();

            // Receive the VehicleResponse object from the server and print its contents
            VehicleResponse response = (VehicleResponse) ois.readObject();
            System.out.println(response);
        }
    }
}