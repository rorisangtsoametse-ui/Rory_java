// Program to check if a number is a palindrome using a method.
// A number is a palindrome if it reads the same forwards and backwards (e.g., 121).

public class PalindromeNumberMethod {

    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; // Negative numbers are not considered palindromes
        }
        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
