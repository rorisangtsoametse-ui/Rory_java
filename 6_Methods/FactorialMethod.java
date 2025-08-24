// Program to calculate the factorial of a number using a recursive method.
// Recursion is a process in which a method calls itself.

public class FactorialMethod {

    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n < 0) {
            // Factorial is not defined for negative numbers
            return -1; // Or throw an exception
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }
}
