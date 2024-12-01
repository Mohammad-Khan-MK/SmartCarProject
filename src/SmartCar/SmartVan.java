package SmartCar;

import java.time.LocalDate;

public class SmartVan extends Petrol {

    private static double hourlyRate = 12;
    private static double dailyRate = 60;


    public SmartVan(int id, String regNo, String manufacturer, String model, LocalDate regDate, Location location, double engine, int co2) {
        super(id, regNo, manufacturer, model, regDate, location, engine, co2);

    }

    public static double getHourlyRate() {
        return hourlyRate;
    }

    public static void setHourlyRate(double hourlyRate) {
        SmartVan.hourlyRate = hourlyRate;
    }



        @Override
    public String toString() {
        return String.format("""
              %s""",super.toString());
    }


}