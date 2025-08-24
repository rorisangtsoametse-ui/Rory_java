// Program to calculate the sum of the digits of a given number.
// This program uses a while loop to extract and sum each digit.

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        System.out.println("Original Number: " + number);

        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            tempNumber /= 10; // Remove the last digit
        }

        System.out.println("Sum of Digits: " + sum);
    }
}
