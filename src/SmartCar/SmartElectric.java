package SmartCar;

import java.time.LocalDate;

public class SmartElectric extends Vehicle {
    private double battery;
    private int range;
    private double efficiency;
    private static  double hourlyRate=14;
    private static  double dailyRate=60;


    public SmartElectric(int id, String regNo, String manufacturer, String model, LocalDate regDate, Location location, double battery, int range, double efficiency) {
        super(id, regNo, manufacturer, model, regDate, location);
        this.battery = battery;
        this.range = range;
        this.efficiency = efficiency;
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

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public static double getHourlyRate() {
        return hourlyRate;
    }

    public static void setHourlyRate(double hourlyRate) {
        SmartElectric.hourlyRate = hourlyRate;
    }

    public static double getDailyRate() {
        return dailyRate;
    }

    public static void setDailyRate(double dailyRate) {
        SmartElectric.dailyRate = dailyRate;
    }
    @Override
    public String toString() {
        return String.format(""" 
                %sBattery: %.1f kWh Range: %d km Efficiency: %.2f kWh/km
                """,super.toString(),battery,range,efficiency);
    }
}

