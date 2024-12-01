package SmartCar;

import java.time.LocalDate;

public abstract class Petrol extends Vehicle {
    private double engine;
    private int co2;


    public Petrol(int id, String regNo,String manufacturer, String model, LocalDate regDate, Location location, double engine, int co2) {
        super(id, regNo, manufacturer, model, regDate, location);
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
        %sEngine Size: %.1f cc  CO2 Emission: %d g/km
        """, super.toString(), engine, co2);  // Ensure engine and co2 are correctly passed
    }

}
