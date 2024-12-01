package SmartCar;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import SmartCar.Location;

import javax.swing.*;

public class Main {


    public static  ArrayList<Vehicle> fleets = new ArrayList<>();
    public static  ArrayList<Booking> bookings = new ArrayList<>();
    public static    ArrayList<Customer> customers = new ArrayList<>();
    public static   ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {


        // SmartCity Vehicles (Petrol)
        fleets.add(new SmartCity(1, "123D456", "Nissan", "Micra", LocalDate.of(2021, 3, 15), Location.LIMERICK, 1.2, 120));
        fleets.add(new SmartCity(2, "234D567", "Renault", "Clio", LocalDate.of(2022, 6, 22), Location.SHANNON, 1.4, 130));


        // SmartTripper Vehicles (Petrol)
        fleets.add(new SmartTripper(4, "456D789", "Skoda", "Scala", LocalDate.of(2022, 1, 8), Location.FOYNES, 1.6, 140));
        fleets.add(new SmartTripper(5, "567D890", "Hyundai", "i30", LocalDate.of(2021, 10, 18), Location.NENAGH, 1.8, 150));


        // SmartVan Vehicles (Petrol)
        fleets.add(new SmartVan(7, "789D012", "Ford", "Transit", LocalDate.of(2021, 11, 3), Location.NENAGH, 2.0, 160));
        fleets.add(new SmartVan(8, "890D123", "Citroen", "Berlingo", LocalDate.of(2022, 7, 20), Location.ENNIS, 2.2, 170));
        // SmartElectric Vehicles


        // Dummy Customer Data
        customers.add(new Customer("John", "Doe", "john.doe@example.com", "123 Main St, Limerick", 101));
        customers.add(new Customer("Jane", "Smith", "jane.smith@example.com", "456 Oak St, Ennis", 102));

        // Dummy Employee Data
        employees.add(new Employee("Alice", "Brown", "alice.brown@example.com", "789 Pine St, Shannon", 201));
        employees.add(new Employee("Bob", "White", "bob.white@example.com", "321 Maple St, Nenagh", 202));

        //Bookings
        bookings.add(new Booking(1, 1, 101, LocalDate.of(2024, 12, 1), LocalTime.of(9, 0), LocalDate.of(2024, 12, 1), LocalTime.of(17, 0), "LIMERICK"));
        bookings.add(new Booking(2, 4, 102, LocalDate.of(2024, 12, 2), LocalTime.of(10, 30), LocalDate.of(2024, 12, 2), LocalTime.of(14, 0), "SHANNON"));


    }
}






