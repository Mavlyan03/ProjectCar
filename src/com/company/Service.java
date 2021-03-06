package com.company;

import java.io.IOException;

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

    public static void changeDriver(Car car, Driver driver) {
        try {
            if (car.getState().equals(State.BASE)) {
                car.setDriver(driver.getDriverName());
                driver.setBus(car.getName());
            } else if (car.getDriver() != null) {
                if (car.getState().equals(State.ROUTE)) {
                    System.out.println("Driver started his way successfully!");
                } else {
                    throw new MyException("You can't drive without driver!");
                }
            } else {
                car.setState(State.REPAIR);
                System.out.println("Car is on repairing now!");
            }
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void startDriving(Car car, Driver driver) {
        try {
            if (car.getState().equals(State.BASE)) {
                if (car.getDriver() != null) {
                    car.setState(State.ROUTE);
                    System.out.println("Driver started his way successfully!");
                } else if (car.getState().equals(State.BASE)) {
                    if (car.getDriver() == null) {
                        throw new IOException();
                    }
                }
            }  else if (car.getState().equals(State.ROUTE)) {
                throw new MyException("Car is already on the route!");
            }
            else {
                car.setState(State.REPAIR);
                System.out.println("Car is on repairing now!");
            }
        } catch(MyException e) {
            System.err.println(e.getMessage());
        } catch(IOException e) {
            System.err.println("You can't drive without driver!");
        }
    }

    public static void startRepair(Car car, Driver driver) {
        try {
            if (car.getState().equals(State.BASE)) {
                car.setState(State.REPAIR);
                System.out.println("Car is on repairing now!");

            } else if (car.getState().equals(State.REPAIR)) {
                throw new MyException("Car is already on repair now!");
            }
            else if (car.getState().equals(State.ROUTE)) {
                car.setState(State.REPAIR);
                System.out.println("Car is on repairing now!");
            }

        } catch(MyException e) {
            System.err.println(e.getMessage());
        }
    }

}
