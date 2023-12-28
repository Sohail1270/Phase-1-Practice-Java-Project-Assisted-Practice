public class WhileloopExample {
    public static void main(String[] args) {
        // Example 1: Counting from 1 to 5 using while loop
        int count = 1;
        System.out.println("Example 1: Counting from 1 to 5 using while loop");
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Example 2: Computing the sum of numbers from 1 to 10 using while loop
        int sum = 0;
        int number = 1;
        System.out.println("\nExample 2: Computing the sum of numbers from 1 to 10 using while loop");
        while (number <= 10) {
            sum += number;
            number++;
        }
        System.out.println("Sum: " + sum);
    }
}

