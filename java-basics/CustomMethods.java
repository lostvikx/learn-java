public class CustomMethods {
    public static void main(String[] args) {
        String name = "Vikram";
        sayHello(name);

        System.out.println("5 + 7 = " + addNumbers(5, 7));

        System.out.println("Integer sum 3 + 2 = " + add(3, 2));
        System.out.println("Double sum 4.2 + 5.8 = " + add(4.2, 5.8));
    }

    // Parts of a method:
    // Access modifier: public, private, protected, default (none)
    // Optional: static (call method without instanciation of class), final (cannot override), abstract (no body), synchornized (thread access)
    // Return type: void (no return value), int, String, double, etc.
    // Method name (camelCase)
    // Parameters: (type param1, type param2, ...)

    static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Overloaded Methods: Same name, but different params.
    // Method signature = Method Name + Parameters (different datatypes, no. of params, or order)

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
