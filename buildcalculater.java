import java.util.Scanner;

public class buildcalculater {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("=== Welcome to Java CLI Calculator ===");
        
        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = Sc.nextDouble();
        
        // Input operation operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = Sc.next().charAt(0);
        
        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = Sc.nextDouble();
        
        double result;
        
        // Perform calculation based on the chosen operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
                
            case '/':
                // Handle division by zero safety constraint
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
                
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                break;
        }
        
       Sc.close();
        System.out.println("======================================");
    }
}