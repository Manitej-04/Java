import java.util.Scanner;

//public class CalculatorInefficient {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        double a = sc.nextDouble();
//
//        System.out.print("Enter second number: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Enter operator: ");
//        char op = sc.next().charAt(0);
//
//        if (op == '+') {
//            System.out.println("Result: " + (a + b));
//        } else if (op == '-') {
//            System.out.println("Result: " + (a - b));
//        } else if (op == '*') {
//            System.out.println("Result: " + (a * b));
//        } else if (op == '/') {
//            if (b != 0) {
//                System.out.println("Result: " + (a / b));
//            } else {
//                System.out.println("Error: Division by zero");
//            }
//        } else {
//            System.out.println("Invalid operator");
//        }
//
//        sc.close();
//    }
//}
public class AdvanceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("Error: Invalid operator entered.");
                valid = false;
                result = 0;
        }
        if (valid) {
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}