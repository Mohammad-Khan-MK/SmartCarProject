package SmartCar;

import java.time.LocalDate;

public class SmartCity extends Petrol{

    private double hourlyRate;
    private double dailyRate;
    private double kmDriven;


    public SmartCity(int id, String regNo, String model, LocalDate regDate, String location, double engine, int co2, double hourlyRate, double dailyRate, double kmDriven) {
        super(id, regNo, model, regDate, location, engine, co2);
        this.hourlyRate = hourlyRate;
        this.dailyRate = dailyRate;
        this.kmDriven = kmDriven;
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

    public double getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(double kmDriven) {
        this.kmDriven = kmDriven;
    }

    @Override
    public String toString() {
        return String.format("""
                """,super.toString());
    }
}
