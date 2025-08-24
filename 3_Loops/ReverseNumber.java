// Program to reverse a given integer using a while loop.
// This program extracts the last digit of the number in each iteration.

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        System.out.println("Original Number: " + number);

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
