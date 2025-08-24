// Program to calculate the factorial of a number using a for loop.
// The factorial of a non-negative integer n, denoted by n!,
// is the product of all positive integers less than or equal to n.

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1; // Use long to store larger factorial values

        // Factorial of 0 is 1
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
