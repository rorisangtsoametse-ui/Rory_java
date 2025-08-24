// Program to reverse a string using a method.
// This method takes a string as input and returns the reversed string.

public class ReverseStringMethod {

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
