import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Input operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        // Perform operation using switch-case
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
