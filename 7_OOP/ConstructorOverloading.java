// Program to demonstrate constructor overloading.
// Constructor overloading allows a class to have multiple constructors
// that have different parameter lists.

class Student {
    String name;
    int age;
    String major;

    // Constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.major = "Undeclared"; // Default value
    }

    // Constructor with three parameters
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Major: " + major);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Create objects using different constructors
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22, "Computer Science");

        System.out.println("Student 1 details:");
        student1.display();

        System.out.println("\nStudent 2 details:");
        student2.display();
    }
}
