// Program to find the ASCII value of a character.
// In Java, characters are stored as integers, so we can cast a char to an int.

public class AsciiValue {
    public static void main(String[] args) {
        char ch = 'A';
        int asciiValue = (int) ch;

        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        ch = 'z';
        asciiValue = ch; // Implicit casting also works
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
