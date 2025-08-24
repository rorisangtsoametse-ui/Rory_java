// Program to find the largest of three numbers using a simple if-else if-else ladder.
// This is an alternative to the nested if-else structure.

public class LargestOfThreeIfElse {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        // Check if num1 is the largest
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        }
        // Check if num2 is the largest
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        }
        // If neither num1 nor num2 are the largest, then num3 must be the largest
        else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}
