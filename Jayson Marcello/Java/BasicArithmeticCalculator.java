package jasutinn;

import java.util.Scanner;

public class BasicArithmeticCalculator {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nSelect an operation\n(+, -, *, /):\n");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("\nResult: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("\nResult: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("\nResult: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("\nError: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("\nResult: " + result);
                }
                break;
            default:
                System.out.println("\nError: Invalid operator.");
        }

        scanner.close();
        return;
    }
}

