// Program to demonstrate an abstract class and abstract methods.
// An abstract class cannot be instantiated and is meant to be subclassed.
// It can contain both abstract methods (without a body) and concrete methods.

abstract class GraphicObject {
    // An abstract method - must be implemented by subclasses
    abstract void draw();

    // A concrete method
    void moveTo(int x, int y) {
        System.out.println("Moving to coordinates (" + x + ", " + y + ")");
    }
}

class Square extends GraphicObject {
    // Implementation of the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // We cannot create an instance of GraphicObject:
        // GraphicObject go = new GraphicObject(); // This would cause a compile error

        Square square = new Square();
        square.draw();
        square.moveTo(10, 20);
    }
}
