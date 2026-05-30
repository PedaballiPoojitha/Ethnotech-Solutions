import java.util.*;
class UberRide {
    String customerName;
    double distance;
    UberRide(String customerName, double distance) {
        this.customerName = customerName;
        this.distance = distance;
    }

    double calculateFare() {
        return 0;
    }
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs." + calculateFare());
    }
}
class Auto extends UberRide {
    Auto(String customerName, double distance) {
        super(customerName, distance);
    }
    @Override
    double calculateFare() {
        return distance * 12;
    }
}
class Cab extends UberRide {
    Cab(String customerName, double distance) {
        super(customerName, distance);
    }
    @Override
    double calculateFare() {
        return distance * 18;
    }
}
class Bike extends UberRide {
    Bike(String customerName, double distance) {
        super(customerName, distance);
    }
    @Override
    double calculateFare() {
        return distance * 8;
    }
}
public class Uber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Distance: ");
        double distance = sc.nextDouble();
        UberRide auto = new Auto(name, distance);
        UberRide cab = new Cab(name, distance);
        UberRide bike = new Bike(name, distance);
        double autofare = auto.calculateFare();
        double cabfare = cab.calculateFare();
        double bikefare = bike.calculateFare();
        System.out.println("Auto Charges: " + autofare);
        System.out.println("Cab Charges: " + cabfare);
        System.out.println("Bike Charges: " + bikefare);
        if (autofare <= cabfare && autofare <= bikefare) {
            auto.displayDetails();
            System.out.println("Auto is the best option to travel");
        }
        else if (cabfare <= autofare && cabfare <= bikefare) {
            cab.displayDetails();
            System.out.println("Cab is the best option to travel");
        }
        else {
            bike.displayDetails();
            System.out.println("Bike is the best option to travel");
        }
    }
}