package que1_calculate;

import java.util.Scanner;

/* 1. Write a “main” method into main class. It has scanner that takes user input.
Also write the logic that it ask user to “Enter first Number:”,

“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective for other symbol.

- With the result it’s also print one more message “Would you like to do more calculation
Please enter “Y” or “N” :” (Hint use while loop if user enter Y program asking the user to enter First Number,
and if user enter N program should terminate)

*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Que1_Calculator calculator = new Que1_Calculator();

        char choice;
        do {
            // Ask user to enter first number
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            // Ask user to enter second number
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            // Ask user to enter a symbol
            System.out.print("Please enter one of the symbols +, -, *, /: ");
            char symbol = scanner.next().charAt(0);

            // Perform the calculation based on the symbol provided
            calculator.calculateResult(a, b, symbol);

            // Ask user if they want to do more calculations
            System.out.print("Would you like to do more calculations? Please enter Y or N: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        // Close the scanner
        scanner.close();
    }
}




