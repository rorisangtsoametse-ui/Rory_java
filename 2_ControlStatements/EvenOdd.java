// Program to check if a number is even or odd using the modulo operator.
// A number is even if it is perfectly divisible by 2.

public class EvenOdd {
    public static void main(String[] args) {
        int number = 29;

        // Check if the remainder when divided by 2 is 0
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
