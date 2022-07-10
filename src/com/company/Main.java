package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static final Gson GSON = GSON_BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH_Car = Paths.get("./car.gson");
    public static final Path WRITE_PATH_DRIVER = Paths.get("./driver.gson");

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = {
                new Car(1, "Chevrolet Impala ", null, State.BASE),
                new Car(2, "Toyota Highlander", null, State.BASE),
                new Car(3, "Cadillac Escalade", null, State.BASE)
        };

        Driver[] drivers = {
                new Driver("driver-1", "John", null),
                new Driver("driver-2", "Dean", null),
                new Driver("driver-3", "Sam ", null)
        };

        String jsonCar = GSON.toJson(cars);
        setWritePath(jsonCar);

        String jsonDriver = GSON.toJson(drivers);
        setWritePathDriver(jsonDriver);
        System.out.println();


    }
    private static void setWritePath(String object){
        Path setWritePath = Paths.get(String.valueOf(WRITE_PATH_Car));
        try {
            Files.writeString(setWritePath, object, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e){
            System.err.println("This is file is not exist!");
        }
    }
    private static void setWritePathDriver(String object) {
        Path setWritePathDriver = Paths.get(String.valueOf(WRITE_PATH_DRIVER));
        try {
            Files.writeString(setWritePathDriver, object, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.err.println("This is file is not exist!");
        }
    }
}
