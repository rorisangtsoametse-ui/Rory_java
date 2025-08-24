// Program to demonstrate multiple inheritance using interfaces.
// Java does not support multiple inheritance with classes, but a class can
// implement multiple interfaces.

// Interface 1
interface Swimmer {
    void swim();
}

// Interface 2
interface Flyer {
    void fly();
}

// A class implementing both interfaces
class Duck implements Swimmer, Flyer {
    @Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.swim();
        donald.fly();
    }
}
