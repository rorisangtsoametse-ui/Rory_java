// Program to demonstrate Dynamic Method Dispatch (Runtime Polymorphism).
// A call to an overridden method is resolved at runtime, not compile time.
// This is achieved by using a superclass reference to a subclass object.

class Figure {
    void displayArea() {
        System.out.println("Area calculation not implemented for generic figure.");
    }
}

class Triangle extends Figure {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    void displayArea() {
        System.out.println("Area of Triangle is " + (0.5 * base * height));
    }
}

class Box extends Figure {
    double width, depth;

    Box(double w, double d) {
        width = w;
        depth = d;
    }

    @Override
void displayArea() {
        System.out.println("Area of Box is " + (width * depth));
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Figure figRef; // Superclass reference

        Triangle triangle = new Triangle(10, 8);
        Box box = new Box(10, 5);

        figRef = triangle; // figRef refers to a Triangle object
        figRef.displayArea(); // Calls Triangle's version of displayArea()

        figRef = box; // figRef now refers to a Box object
        figRef.displayArea(); // Calls Box's version of displayArea()
    }
}
