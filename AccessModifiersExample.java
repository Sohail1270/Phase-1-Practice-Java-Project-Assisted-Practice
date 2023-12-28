
// A class with different access modifiers
public class AccessModifiersExample {

    public int publicVariable = 10;
    protected int protectedVariable = 20;
    int defaultVariable = 30; // Default access modifier
    private int privateVariable = 40;

    // Public method
    public void publicMethod() {
        System.out.println("Public method called");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    // Default method
    void defaultMethod() {
        System.out.println("Default method called");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method called");
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing variables
        System.out.println("Public variable: " + example.publicVariable);
        System.out.println("Protected variable: " + example.protectedVariable);
        System.out.println("Default variable: " + example.defaultVariable);
        System.out.println("Private variable: " + example.privateVariable); // Cannot access directly

        // Accessing methods
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod(); // Cannot access directly
    }
}
