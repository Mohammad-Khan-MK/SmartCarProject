package SmartCar;

import java.time.LocalDate;

public abstract class Vehicle {
    private int id;
    private String regNo;
    private String manufacturer;
    private String model;
    private LocalDate regDate;
    private Location location;

    public Vehicle(int id, String regNo, String manufacturer, String model, LocalDate regDate, Location location) {
        this.id = id;
        this.regNo = regNo;
        this.manufacturer = manufacturer;
        this.model = model;
        this.regDate = regDate;
        this.location =location;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public Location getLocation() {
        return location;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("""
            Vehicle ID: %d  Vehicle Registration No: %s
            Manufacturer: %s  Model: %s  Reg Date: %s
            Location: %s
            """, id, regNo, manufacturer, model, regDate, location);
    }



}
