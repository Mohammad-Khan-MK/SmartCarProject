package SmartCar;

import java.time.LocalDate;

public class Booking {
    private int bookingID;
    private int vehicleID;
    private int custNo;
    private LocalDate pickUpDate;
    private LocalDate returnDate;
    private String pickUpLocation;

    public Booking(int bookingID, int vehicleID, int custNo, LocalDate pickUpDate, LocalDate returnDate, String pickUpLocation) {
        this.bookingID = bookingID;
        this.vehicleID = vehicleID;
        this.custNo = custNo;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
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

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }


//"Booking{" +
//        "bookingID=" + bookingID +
//            ", vehicleID=" + vehicleID +
//            ", custNo=" + custNo +
//            ", pickUpDate=" + pickUpDate +
//            ", returnDate=" + returnDate +
//            ", pickUpLocation='" + pickUpLocation + '\'' +
//            '}'
    @Override
    public String toString() {
        return String.format("""
                Booking ID: %d | Vehicle ID: %d | Cust No: %d
                Pick Up Date: %s | Return Date: %s 
                Pick Up Location: %s |
                """,bookingID,vehicleID,custNo,pickUpDate,returnDate,pickUpLocation);
    }
}
