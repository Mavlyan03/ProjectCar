package com.company;

import java.io.IOException;

public class Car {
    private int id;
    private String name;
    private String driver;
    private State state;

    public Car(int id, String name, String driver, State state) throws IOException {
        this.id = id;
        this.name = name;
        this.driver = driver;
        this.state = state;
    }
    public Car() {};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                "| " + id +
                        " | " + name +
                        " |  " + driver +
                        "    |  " + state + "   |";
    }

}
