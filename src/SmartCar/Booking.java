package SmartCar;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private int bookingID;
    private int vehicleID;
    private int custNo;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    private Location pickUpLocation;

    public Booking(int bookingID, int vehicleID, int custNo, LocalDate pickUpDate, LocalTime pickUptime, LocalDate returnDate, LocalTime returnTime, Location pickUpLocation) {
        this.bookingID = bookingID;
        this.vehicleID = vehicleID;
        this.custNo = custNo;
        this.pickUpDate = pickUpDate;
        this.pickUpTime = pickUptime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.pickUpLocation = pickUpLocation;
    }

    public int getBookingID() {
        return bookingID;
    }


    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public LocalTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalTime pickUptime) {
        this.pickUpTime = pickUptime;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalTime returnTime) {
        this.returnTime = returnTime;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }


    @Override
    public String toString() {
        return String.format("""
                Booking ID: %d | Vehicle ID: %d | Cust No: %d
                Pick Up Date: %s | Pick Up Time: %s
                Return Date: %s  | Return Time: %s 
                Pick Up Location: %s |
                """,bookingID,vehicleID,custNo,pickUpDate,pickUpTime,returnDate,returnTime,pickUpLocation);
    }


}
