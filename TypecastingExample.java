public class TypecastingExample {
    public static void main(String[] args) {
        // Implicit casting (Widening)
        int intValue = 10;
        long longValue = intValue; // Automatic casting from int to long
        float floatValue = longValue; // Automatic casting from long to float
        double doubleValue = floatValue; // Automatic casting from float to double

        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // Explicit casting (Narrowing)
        double bigDouble = 1234.5678;
        float smallFloat = (float) bigDouble; // Manual casting from double to float
        long bigLong = (long) smallFloat; // Manual casting from float to long
        int smallInt = (int) bigLong; // Manual casting from long to int

        System.out.println("\nExplicit Casting:");
        System.out.println("double to float: " + smallFloat);
        System.out.println("float to long: " + bigLong);
        System.out.println("long to int: " + smallInt);
    }
}
