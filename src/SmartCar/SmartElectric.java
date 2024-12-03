package SmartCar;

import java.time.LocalDate;

public class SmartElectric extends Vehicle {
    private double battery;
    private int range;
    private double efficiency;
    private static  double hourlyRate=14;
    private static  double dailyRate=70;


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

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }


    public static double getHourlyRate() {
        return hourlyRate;
    }

    public static void setHourlyRate(double newHourlyRate) {
        if(newHourlyRate>0){
            hourlyRate = newHourlyRate;
        }
        else{
            throw new IllegalArgumentException("Hourly rate must be a positive number");
        }

    }

    public static double getDailyRate() {
        return dailyRate;
    }

    public static void setDailyRate(double newDailyRate) {
        if(newDailyRate>0){
            dailyRate = newDailyRate;
        }

        else{throw new IllegalArgumentException("Daily rate must be a positive number");}

    }




    @Override
    public String toString() {
        return String.format(""" 
                %sBattery: %.1f KWh Range: %d Km Efficiency: %.2f Kwh/km
                Hourly Rate: %s  Daily Rate: %s
                """,super.toString(),battery,range,efficiency,hourlyRate,dailyRate);
    }
}

