package SmartCar;

import java.time.LocalDate;

public abstract class Petrol extends Vehicle {
    private double engine;
    private int co2;


    public Petrol(int id, String regNo, String model, LocalDate regDate, String location, double engine, int co2) {
        super(id, regNo, model, regDate, location);
        this.engine = engine;
        this.co2 = co2;
    }


    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    @Override
    public String toString() {
        return String.format("""
                """);
    }
}
