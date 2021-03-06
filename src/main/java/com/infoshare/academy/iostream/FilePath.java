package com.infoshare.academy.iostream;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePath {
    //Collection of file locations
    private static Path carData = Paths.get("src/main/resources/carData.csv");
    private static Path reservationPath = Paths.get("src/main/resources/reservation.csv");
    private static Path carPassengerData = Paths.get("src/main/resources/carPassengerData.csv");
    private static Path carOffRoadData = Paths.get("src/main/resources/carOffRoadData.csv");
    private static Path carTruckData = Paths.get("src/main/resources/carTruckData.csv");
    private static Path userData = Paths.get("src/main/resources/userData.csv");

    //Getters
    public static Path getCarData() {
        return carData;
    }

    public static Path getReservationPath() {
        return reservationPath;
    }

    public static Path getCarPassengerData() {
        return carPassengerData;
    }

    public static Path getCarOffRoadData() {
        return carOffRoadData;
    }

    public static Path getCarTruckData() {
        return carTruckData;
    }

    public static Path getUserData() {
        return userData;
    }
}
