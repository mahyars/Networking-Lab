package edu.sdccd.cisc191.server;

import edu.sdccd.cisc191.VehicleRequest;
import edu.sdccd.cisc191.VehicleResponse;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Define the port number for the server to listen on
        int port = 8080;
        // Create a ServerSocket to listen for client connections
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                // Accept a new client connection and create a Socket for communication
                try (Socket socket = serverSocket.accept();
                     ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                     ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {

                    // Read and deserialize the VehicleRequest object from the client
                    VehicleRequest request = (VehicleRequest) ois.readObject();
                    VehicleResponse response = new VehicleResponse(request, 10000, 20000,
                            5, 4, new String[]{"Air Conditioning", "GPS"});

                    // Serialize and send the VehicleResponse object to the client
                    oos.writeObject(response);
                    oos.flush();
                }
            }
        }
    }
}