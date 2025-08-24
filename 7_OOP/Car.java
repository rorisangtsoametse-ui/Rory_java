// Program to demonstrate a simple class and object.
// The Car class has attributes (fields) and behaviors (methods).

public class Car {
    // Fields
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details: " + year + " " + make + " " + model);
    }

    // Main method to create and use Car objects
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Corolla", 2022);
        // Call the displayDetails method
        myCar.displayDetails();

        Car anotherCar = new Car("Honda", "Civic", 2021);
        anotherCar.displayDetails();
    }
}
