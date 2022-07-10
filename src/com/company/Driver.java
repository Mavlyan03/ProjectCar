package com.company;

public class Driver {
    private String id;
    private String driverName;
    private String bus;

    public Driver(String id, String driver, String bus) {
        this.id = id;
        this.driverName = driver;
        this.bus = bus;
    }

    public Driver() {};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return
                "| " + id +
                        " | " + driverName +
                        "\t\t| " + bus ;
    }

}
