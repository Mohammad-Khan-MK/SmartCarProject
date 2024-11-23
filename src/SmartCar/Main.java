package SmartCar;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

      Customer c1= new Customer("Mohammad","Khan","saif1231@gmail.com","504 Richmond Court","Mount Kenneth Place, Dock Road","Limerick","V94KD63",1001);
        System.out.print(c1);

        Employee e1=new Employee("Rafsan","Khan","rkhan@gmail.com","123 ABC Street","Dock Road","Cork","V94GG98",115);
        System.out.print(e1);

        Employee e2=new Employee("Rafsan","Khan","rkhan@gmail.com","123 ABC Street","Dock Road","Cork","V94GG98",115);
        System.out.print(e2);

        Booking b1=new Booking(0123,1234,2340, LocalDate.of(2024,8,13),LocalDate.of(2024,11,25),"Limerick Dock Road");
        System.out.print(b1);


    }
}