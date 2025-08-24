// Program to demonstrate a simple class hierarchy for shapes.
// This shows inheritance and polymorphism.

// Base class (Superclass)
class Shape {
    public double getArea() {
        return 0.0; // Default implementation
    }

    public String getName() {
        return "Shape";
    }
}

// Derived class (Subclass)
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

// Derived class (Subclass)
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        for (Shape s : shapes) {
            System.out.println("Area of " + s.getName() + " is: " + s.getArea());
        }
    }
}
