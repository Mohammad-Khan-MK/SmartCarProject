package SmartCar;

import java.time.LocalDate;

public abstract class Vehicle {
    private int id;
    private String regNo;
    private String model;
    private LocalDate regDate;
    private String location;


    public Vehicle(int id, String regNo, String model, LocalDate regDate, String location) {
        this.id = id;
        this.regNo = regNo;
        this.model = model;
        this.regDate = regDate;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("""
                
                """);
    }
}
