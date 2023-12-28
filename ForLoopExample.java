public class ForLoopExample {
    public static void main(String[] args) {
        // Example 1: Counting from 1 to 5 using for loop
        System.out.println("Example 1: Counting from 1 to 5 using for loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Example 2: Computing the sum of numbers from 1 to 10 using for loop
        int sum = 0;
        System.out.println("\nExample 2: Computing the sum of numbers from 1 to 10 using for loop");
        for (int j = 1; j <= 10; j++) {
            sum += j;
        }
        System.out.println("Sum: " + sum);

        // Example 3: Looping through an array using for loop
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("\nExample 3: Looping through an array using for loop");
        for (int k = 0; k < numbers.length; k++) {
            System.out.println("Element at index " + k + ": " + numbers[k]);
        }
    }
}

