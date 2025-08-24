// Program to convert a temperature from Celsius to Fahrenheit.
// The formula for conversion is: F = (C * 9/5) + 32

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit;

        // Conversion formula
        fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}
