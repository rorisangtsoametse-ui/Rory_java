// Program to check if a character is a vowel or a consonant.
// The five vowels are A, E, I, O, U (and their lowercase counterparts).

public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'i';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            // We can add a check to ensure the character is an alphabet
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch + " is a consonant.");
            } else {
                System.out.println(ch + " is not an alphabet character.");
            }
        }
    }
}
