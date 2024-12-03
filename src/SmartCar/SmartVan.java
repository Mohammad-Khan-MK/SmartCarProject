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

    public static void setHourlyRate(double newHourlyRate) {
        if(hourlyRate>0){
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
              %sHourly Rate: %.2f  Daily Rate: %.2f
              """, super.toString(), getHourlyRate(), getDailyRate());
}


}