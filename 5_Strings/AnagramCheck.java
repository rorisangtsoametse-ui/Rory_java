import java.util.Arrays;

// Program to check if two strings are anagrams.
// Two strings are anagrams if they contain the same characters in a different order.
// For example, "listen" and "silent".

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Remove whitespace and convert to lowercase for accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        boolean areAnagrams = false;

        // Check if lengths are the same, otherwise they can't be anagrams
        if (str1.length() == str2.length()) {
            // Convert strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort the character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted arrays
            areAnagrams = Arrays.equals(charArray1, charArray2);
        }

        if (areAnagrams) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
    }
}
