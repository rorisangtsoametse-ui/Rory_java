// Program to demonstrate method overriding (runtime polymorphism).
// Method overriding occurs when a subclass provides a specific implementation
// for a method that is already defined in its superclass.

class Animal {
    // Method in the superclass
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myDog = new Dog();       // Create a Dog object
        Animal myCat = new Cat();       // Create a Cat object

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
