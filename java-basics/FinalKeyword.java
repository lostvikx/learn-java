public class FinalKeyword {
    public static void main(String[] args) {
        // double pi = 3.14159;  // pi is a variable.
        // pi = 4;

        final double PI = 3.14159;  // pi is a constant.
        // PI = 4;  // Exception: The final local variable PI cannot be assigned.

        System.out.printf("Pi: %.2f\n", PI);
    }
}
