// Program to swap two numbers without using a temporary variable.
// This program demonstrates a common trick using arithmetic operations.

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic
        a = a + b; // a becomes 30
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
