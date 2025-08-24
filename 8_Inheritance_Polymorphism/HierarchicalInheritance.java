// Program to demonstrate hierarchical inheritance.
// In hierarchical inheritance, multiple subclasses inherit from a single superclass.

// Superclass
class Mammal {
    void eat() {
        System.out.println("This mammal eats food.");
    }
}

// Subclass 1
class Lion extends Mammal {
    void roar() {
        System.out.println("The lion roars.");
    }
}

// Subclass 2
class Human extends Mammal {
    void think() {
        System.out.println("The human thinks.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Lion simba = new Lion();
        simba.eat();  // Inherited method
        simba.roar(); // Own method

        Human alice = new Human();
        alice.eat();   // Inherited method
        alice.think(); // Own method
    }
}
