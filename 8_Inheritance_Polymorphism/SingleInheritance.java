// Program to demonstrate single inheritance.
// In single inheritance, a class inherits properties from a single superclass.

// Superclass
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle...");
    }
}

// Subclass inheriting from Vehicle
class Bike extends Vehicle {
    void wheelie() {
        System.out.println("Performing a wheelie on the bike!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.drive();    // Method from the superclass
        myBike.wheelie();  // Method from the subclass
    }
}
