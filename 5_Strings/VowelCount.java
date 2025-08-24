// Program to count the number of vowels in a given string.
// Vowels are 'a', 'e', 'i', 'o', 'u' and their uppercase counterparts.

public class VowelCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        // Convert the string to lowercase to simplify vowel checking
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("The number of vowels in the string is: " + count);
    }
}
