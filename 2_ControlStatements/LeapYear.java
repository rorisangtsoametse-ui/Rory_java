// Program to check if a year is a leap year.
// A year is a leap year if it is divisible by 4, except for end-of-century years,
// which must be divisible by 400.

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;

        boolean isLeap = false;

        // A year is a leap year if it's divisible by 4
        if (year % 4 == 0) {
            // However, if it's a century year, it must also be divisible by 400
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
