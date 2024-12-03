package SmartCar;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import SmartCar.Location;

import javax.swing.*;

public class Main {
    public static ArrayList<Vehicle> fleets = new ArrayList<>();
    public static ArrayList<Booking> bookings = new ArrayList<>();
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Employee> employees = new ArrayList<>();


    public static void initialize() {
        // SmartCity Vehicles (Petrol)
        fleets.add(new SmartCity(1, "123D456", "Nissan", "Micra", LocalDate.of(2021, 3, 15), Location.LIMERICK, 1.2, 120));



        // SmartTripper Vehicles (Petrol)
        fleets.add(new SmartTripper(2, "456D789", "Skoda", "Scala", LocalDate.of(2022, 1, 8), Location.FOYNES, 1.6, 140));



        // SmartVan Vehicles (Petrol)
        fleets.add(new SmartVan(3, "789D012", "Ford", "Transit", LocalDate.of(2021, 11, 3), Location.NENAGH, 2.0, 160));

        // SmartElectric Vehicles
        fleets.add(new SmartElectric(4,"125V98","Kia ","EV6",LocalDate.of(2020,12,25),Location.NENAGH,77.4,500,.25));


        // Dummy Customer Data
        customers.add(new Customer("John", "Doe", "john.doe@example.com", "123 Main St, Limerick", 1));
        customers.add(new Customer("Jane", "Smith", "jane.smith@example.com", "456 Oak St, Ennis", 2));

        // Dummy Employee Data
        employees.add(new Employee("Alice", "Brown", "alice.brown@example.com","789 Pine St, Shannon", 1));
        employees.add(new Employee("Bob", "White", "bob.white@example.com", "321 Maple St, Nenagh", 2));


        //Bookings
        bookings.add(new Booking(1, 1, 101, LocalDate.of(2024, 12, 1), LocalTime.of(9, 0), LocalDate.of(2024, 12, 1), LocalTime.of(17, 0), Location.valueOf("LIMERICK")));
        bookings.add(new Booking(2, 4, 102, LocalDate.of(2024, 12, 2), LocalTime.of(10, 30), LocalDate.of(2024, 12, 2), LocalTime.of(14, 0), Location.valueOf("SHANNON")));
    }

    public static void main(String[] args) {

        initialize();


        //Main menu
        while (true) {
            try {
                String choice = getUserInput("""
            Welcome to The SmartCars The Pay As You Go Rental Service
            Are You a Customer(c)? or an Employee(e)?
           """);

                if (choice == null) {
                    JOptionPane.showMessageDialog(null, "Exiting application!");
                    break; // Exit the loop
                }

                if (choice.equalsIgnoreCase("c")) {
                    customerMenu();
                } else if (choice.equalsIgnoreCase("e")) {
                    employeeMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                break; // Exit the loop if an error occurs
            }
        }


    }

    //Customer Menu
    public static void customerMenu() {
        while (true) {
            try {
                String customerChoice = getUserInput("What would you like to do?\n" +
                        "Sign Up(s), Book a Car(b), Return a Car(r), Back to Main Menu(m)");

                if (customerChoice == null) return; // Return to main menu if canceled

                switch (customerChoice.toLowerCase()) {
                    case "s":
                        signUpCustomer();
                        break;
                    case "b":
                        bookCar();
                        break;
                    case "r":
                        returnCar();
                        break;
                    case "m":
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                return;
            }
        }
    }



    //Employee Menu
    public static void employeeMenu() {
        while (true) {
            try {
                String employeeChoice = getUserInput("""
                    What would you like to do?
                    Add a vehicle(a), Change rates(r), List bookings(b),
                    List customers(c), List all vehicles(v), List all employees(e), Back to Main Menu(m)""");

                if (employeeChoice == null || employeeChoice.equalsIgnoreCase("m")) {
                    return;
                }

                switch (employeeChoice.toLowerCase()) {
                    case "a":
                        addVehicle();
                        break;
                    case "r":
                        changeRates();
                        break;
                    case "b":
                        listBookings();
                        break;
                    case "c":
                        listCustomers();
                        break;
                    case "v":
                        listVehicles();
                        break;
                    case "e":
                        listEmployees();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice! Please try again.");
                }

                String menuChoice = getUserInput("Would you like to continue in the employee menu? (y/n)");

                if (menuChoice == null || menuChoice.equalsIgnoreCase("n")) {
                    JOptionPane.showMessageDialog(null, "Exiting the application.");
                    System.exit(0);
                } else if (!menuChoice.equalsIgnoreCase("y")) {
                    JOptionPane.showMessageDialog(null, "Please enter 'y' to continue or 'n' to exit.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                return;
            }
        }
    }


    //Customer menu Methods

    private static void signUpCustomer() {
        try {

            String firstName = getUserInput("Enter First Name:");
            if (firstName == null) return;

            String lastName = getUserInput("Enter Last Name:");
            if (lastName == null) return;

            String email = getUserInput("Enter Email:");
            if (email == null) return;

            String address = getUserInput("Enter Address:");
            if (address == null) return;

            int custNo = customers.size() + 1;

            customers.add(new Customer(firstName, lastName, email, address, custNo));

            // Show confirmation message with the new customer ID
            JOptionPane.showMessageDialog(null, "Customer Signed Up Successfully! Your Customer ID is: " + custNo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred during sign-up: " + e.getMessage());
        }
    }





    private static void bookCar() {
        try {
            //reusable method
            int custNo = parseIntInput("Customer ID?");

            //reusable method
            Location location = getLocationFromInput("Location? LIMERICK(L), ENNIS(E), SHANNON(S), NENAGH(N), FOYNES(F)");

            if (location == null) {
                return;
            }
            String carTypeCode = getUserInput("""
                    What type of car would you like to book?
                    City(C), Tripper(T), Van(V), Electricity(E)""").toUpperCase();

            String carType = "";

            switch (carTypeCode) {
                case "C":
                    carType = "City";
                    break;
                case "T":
                    carType = "Tripper";
                    break;
                case "V":
                    carType = "Van";
                    break;
                case "E":
                    carType = "Electric";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid car type code. Please try again.");
                    return;
            }

            // Date and time inputs using reusable methods
            LocalDate pickUpDate = parseDateInput("Pick Up Date? (YYYY-MM-DD):");
            LocalTime pickUpTime = LocalTime.parse(JOptionPane.showInputDialog("Pick Up Time? (HH:MM):"));
            LocalDate returnDate = parseDateInput("Return Date? (YYYY-MM-DD):");
            LocalTime returnTime = LocalTime.parse(JOptionPane.showInputDialog("Return Time? (HH:MM):"));

            if (fleets.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No Car found.");
            } else {
                System.out.println();
                for (Vehicle fleet : fleets) {
                    System.out.println(fleet);
                }
            }

            int vehicleId = parseIntInput("Enter Vehicle ID to Book:");

            Booking newBooking = new Booking(bookings.size() + 1, vehicleId, custNo, pickUpDate, pickUpTime, returnDate, returnTime, location);

            bookings.add(newBooking);

            JOptionPane.showMessageDialog(null, "Car Booked Successfully!\n"
                    + "Booking ID: " + newBooking.getBookingID() + "\n"
                    + "Location: " + location + "\n"
                    + "Car Type: " + carType);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter numeric values for ID or dates.");
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid date or time format. Please enter in the correct format (YYYY-MM-DD or HH:MM).");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred while booking the car: " + e.getMessage());
        }
    }



    public static void addVehicle() {
        try {
            //reusable method
            String input = getUserInput("""
                What type of car would you like to add?
                City(c), Tripper(t), Van(v) or Electricity(e)?""").toLowerCase();

            // Vehicle details inputs using reusable methods
            int id = parseIntInput("Smart Car ID?");
            String regNo = getStringInput("Enter Reg No:");
            String manufacturer = getStringInput("Enter Manufacturer:");
            String model = getStringInput("Enter Model:");
            LocalDate regDate = parseDateInput("Enter Registration Date (YYYY-MM-DD):");

            //  reusable getLocationFromInput method
            Location location = getLocationFromInput("Location? LIMERICK(L), ENNIS(E), SHANNON(S), NENAGH(N), FOYNES(F)");


            if (location == null) {
                return;
            }

            switch (input) {
                case "c":
                    double engineC = parseDoubleInput("Enter Engine Size:");
                    int co2C = parseIntInput("Enter Co2 Rating:");
                    fleets.add(new SmartCity(fleets.size() + 1, regNo, manufacturer, model, regDate, location, engineC, co2C));
                    break;
                case "t":
                    double engineT = parseDoubleInput("Enter Engine Size:");
                    int co2T = parseIntInput("Enter Co2 Rating:");
                    fleets.add(new SmartTripper(fleets.size() + 1, regNo, manufacturer, model, regDate, location, engineT, co2T));
                    break;
                case "v":
                    double engineV = parseDoubleInput("Enter Engine Size:");
                    int co2V = parseIntInput("Enter Co2 Rating:");
                    fleets.add(new SmartVan(fleets.size() + 1, regNo, manufacturer, model, regDate, location, engineV, co2V));
                    break;
                case "e":
                    double battery = parseDoubleInput("Enter Battery Size:");
                    int efficiency = parseIntInput("Enter Efficiency:");
                    int range = parseIntInput("Enter Range:");
                    fleets.add(new SmartElectric(fleets.size() + 1, regNo, manufacturer, model, regDate, location, battery, range, efficiency));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid car type selected!");
                    return;
            }

            // Success message
            JOptionPane.showMessageDialog(null, "Car Added Successfully!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter the correct data.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
    }

    public static void changeRates() {
        try {
            // inputs using reusable method
            String vehicleType = Objects.requireNonNull(getUserInput("""
                    Enter Vehicle Type to change the rates.
                    SmartCity(c), SmartTripper(t), SmartVan(v) or Electricity(e)""")).toLowerCase();

            // reusable methods
            double newHourlyRate = parseDoubleInput("Enter New Hourly Rate:");
            double newDailyRate = parseDoubleInput("Enter New Daily Rate:");


            switch (vehicleType.toLowerCase()) {
                case "c":
                    SmartCity.setHourlyRate(newHourlyRate);
                    SmartCity.setDailyRate(newDailyRate);
                    break;
                case "t":
                    SmartTripper.setHourlyRate(newHourlyRate);
                    SmartTripper.setDailyRate(newDailyRate);
                    break;
                case "v":
                    SmartVan.setHourlyRate(newHourlyRate);
                    SmartVan.setDailyRate(newDailyRate);
                    break;
                case "e":
                    SmartElectric.setHourlyRate(newHourlyRate); // Assuming there is a SmartElectric class
                    SmartElectric.setDailyRate(newDailyRate); // Assuming there is a SmartElectric class
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Vehicle Type!");
                    return;
            }

            // Success message
            JOptionPane.showMessageDialog(null, "Rates Updated Successfully for " + vehicleType + "!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid rate value.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred while updating rates: " + e.getMessage());
        }
    }



    public static void listBookings() {
        if (bookings.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No bookings available.");
        } else {
            System.out.println();
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }



    public static void listCustomers() {
        if (customers.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No customers found.");
        } else {
            System.out.println();
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }

    }

    public static void listVehicles() {
        if (fleets.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No vehicles available.");
        } else {
            System.out.println();
            for (Vehicle fleet : fleets) {
                System.out.println(fleet);
            }
        }
    }

    public static void listEmployees() {
        if (employees.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No employees found.");
        } else {
            System.out.println();
            for (Employee employee : employees) {
                System.out.println(employee); // Will call employee.toString()
            }
        }
    }


    public static void returnCar() {
    }


    // Utility Methods for Reusability
    private static int parseIntInput(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }

    private static double parseDoubleInput(String message) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, message));
    }

    private static String getStringInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    private static LocalDate parseDateInput(String message) {
        return LocalDate.parse(JOptionPane.showInputDialog(null, message));
    }


    private static String getUserInput(String userInput) {
        String input = JOptionPane.showInputDialog(userInput);
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Operation cancelled! Returning to the previous menu.");
            return null;
        }
        return input;
    }
    public static Location getLocationFromInput(String message) {
        String locationInput = JOptionPane.showInputDialog(message).toUpperCase();
        switch (locationInput) {
            case "L":
                return Location.LIMERICK;
            case "E":
                return Location.ENNIS;
            case "S":
                return Location.SHANNON;
            case "N":
                return Location.NENAGH;
            case "F":
                return Location.FOYNES;
            default:
                JOptionPane.showMessageDialog(null, "Invalid location code. Please try again.");
                return null; // Return null if input is invalid
        }
    }



}









