import java.util.Scanner;

public class ThrowThrowsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");

        try {
            int age = scanner.nextInt();

            // Using the throw keyword to throw a custom exception
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }

            // Calling a method that declares throwing an exception
            validateAge(age);

            System.out.println("You entered a valid age: " + age);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // A method that declares throwing an exception using the throws keyword
    private static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
    }
}
