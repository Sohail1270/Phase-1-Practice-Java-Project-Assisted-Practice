import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Code that may throw exceptions
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int result = 10 / number;  // Potential division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching arithmetic exceptions (e.g., division by zero)
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catching other general exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Code in the finally block will be executed regardless of whether an exception occurred or not
            System.out.println("Finally block executed");

            // Close the scanner to prevent resource leak
            scanner.close();
        }

        // Code outside the try-catch-finally block
        System.out.println("Program continues after exception handling");
    }
}
