// Program to find the Greatest Common Divisor (GCD) of two numbers using a method.
// The GCD is the largest positive integer that divides two numbers without a remainder.
// This example uses the Euclidean algorithm.

public class GCDMethod {

    public static void main(String[] args) {
        int n1 = 81, n2 = 153;
        int gcd = findGCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }

    // Method to find GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
