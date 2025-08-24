// Program to find the longest word in a sentence.
// It splits the sentence into words and then finds the one with the maximum length.

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word in the sentence is: " + longestWord);
    }
}
