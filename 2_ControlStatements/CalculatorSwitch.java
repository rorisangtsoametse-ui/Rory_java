// Program to create a simple calculator using a switch-case statement.
// It performs addition, subtraction, multiplication, and division.

public class CalculatorSwitch {
    public static void main(String[] args) {
        char operator = '+';
        double num1 = 10.5;
        double num2 = 5.5;
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
