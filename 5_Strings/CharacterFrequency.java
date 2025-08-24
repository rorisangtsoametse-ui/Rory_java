// Program to find the frequency of a specific character in a string.
// It iterates through the string and counts occurrences of the character.

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "programming is fun";
        char targetChar = 'g';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                frequency++;
            }
        }

        System.out.println("The frequency of '" + targetChar + "' in the string is: " + frequency);
    }
}
