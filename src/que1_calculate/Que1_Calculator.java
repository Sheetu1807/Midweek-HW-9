package que1_calculate;

/* 1. Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”.
All methods are instance method, and it doesn’t return anything. But it has two parameters with name “int a” and “int b”.
Also, each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with three parameter with name int a, int b and char symbol.
Write the logic in calculateResult method that when user enter first number and second number and symbol based on symbol
it does calculate.
 */

public class Que1_Calculator {

    // Instance methods for performing different calculations
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is: " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + result);
    }

    public void division(int a, int b) {
        int result = a / b;
        System.out.println("Division of " + a + " and " + b + " is: " + result);
    }

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + result);
    }

    // Method for performing the calculation based on the symbol provided
    public void calculateResult(int a, int b, char symbol) {
        switch(symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '/':
                division(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }
}

