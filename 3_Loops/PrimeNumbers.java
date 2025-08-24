// Program to print all prime numbers up to a given limit.
// A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 50;
        System.out.println("Prime numbers up to " + limit + ":");

        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;
            // Check for factors from 2 up to the square root of the number
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false; // If a factor is found, it's not a prime number
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // for a new line at the end
    }
}
