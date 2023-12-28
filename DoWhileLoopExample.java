public class DoWhileLoopExample {
    public static void main(String[] args) {
        // Example 1: Counting from 1 to 5 using do-while loop
        int count = 1;
        System.out.println("Example 1: Counting from 1 to 5 using do-while loop");
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        // Example 2: Computing the sum of numbers from 1 to 10 using do-while loop
        int sum = 0;
        int number = 1;
        System.out.println("\nExample 2: Computing the sum of numbers from 1 to 10 using do-while loop");
        do {
            sum += number;
            number++;
        } while (number <= 10);
        System.out.println("Sum: " + sum);
    }
}
