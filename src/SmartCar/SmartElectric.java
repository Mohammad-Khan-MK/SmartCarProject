package SmartCar;

import java.time.LocalDate;

public class SmartElectric extends Vehicle {
    private double hourlyRate;
    private double dailyRate;
    private double battery;
    private int range;
    private int efficiency;

    public SmartElectric(int id, String regNo, String model, LocalDate regDate, String location, double hourlyRate, double dailyRate, double battery, int range, int efficiency) {
        super(id, regNo, model, regDate, location);
        this.hourlyRate = hourlyRate;
        this.dailyRate = dailyRate;
        this.battery = battery;
        this.range = range;
        this.efficiency = efficiency;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }



    @Override
    public String toString() {
        return String.format("""
                """,super.toString());
    }
}
