// Program to check if a string is a palindrome.
// A palindrome is a word, phrase, number, or other sequence of characters
// which reads the same backward as forward.

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = "";
        boolean isPalindrome = false;

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        // Check if the original and reversed strings are equal
        if (str.equals(reversedStr)) {
            isPalindrome = true;
        }

        if (isPalindrome) {
            System.out.println("'" + str + "' is a palindrome.");
        } else {
            System.out.println("'" + str + "' is not a palindrome.");
        }
    }
}
