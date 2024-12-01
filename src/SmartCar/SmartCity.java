package SmartCar;

import java.time.LocalDate;

public class SmartCity extends Petrol {

    private static double hourlyRate = 11;
    private static double dailyRate = 55;


    public SmartCity(int id, String regNo, String manufacturer, String model, LocalDate regDate, Location location, double engine, int co2) {
        super(id, regNo, manufacturer, model, regDate, location, engine, co2);

    }

    public static double getHourlyRate() {
        return hourlyRate;
    }

    public static void setHourlyRate(double hourlyRate) {
        SmartCity.hourlyRate = hourlyRate;
    }

    public static double getDailyRate() {
        return dailyRate;
    }

    public static void setDailyRate(double dailyRate) {
        SmartCity.dailyRate = dailyRate;
    }


    @Override
    public String toString() {
        return String.format("""
              %s""",super.toString());
    }


    }






