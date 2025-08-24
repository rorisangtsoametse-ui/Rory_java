// Program to generate the Fibonacci series up to a certain number of terms.
// The Fibonacci series is a sequence where each number is the sum of the two preceding ones,
// starting from 0 and 1.

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
