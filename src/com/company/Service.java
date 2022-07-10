package com.company;

public class Service {
    public static void getCars(Car[]cars){
        System.out.println("~~~~~~~~~~~~~~~~~ * CARS * ~~~~~~~~~~~~~~~~~~~");
        System.out.println("| # |       Car         |  Driver  |  State  |");
        System.out.println("|---+-------------------+----------+---------|");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void gerDrivers(Driver[]drivers){
        System.out.println("~~~~~~~~~~~~~~ * DRIVERS * ~~~~~~~~~~~~~~~~");
        System.out.println("|     #    |   Driver   |       Car       |");
        System.out.println("|----------+------------+------------------");
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }
    public static void getDescription(Car car) {
        System.out.println("ID: " + car.getId());
        System.out.println("Name: " + car.getName());
        System.out.println("Driver: " + car.getDriver());
        System.out.println("State: " + car.getState());
        System.out.println("Press to 1 to change driver");
        System.out.println("Press to 2 to start driving");
        System.out.println("Press to 3 to start repair");
        System.out.println("---------------------------");
    }

}
