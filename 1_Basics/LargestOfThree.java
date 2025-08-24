// Program to find the largest of three numbers using nested if-else statements.

public class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        int largest;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        System.out.println("The largest of the three numbers is: " + largest);
    }
}
