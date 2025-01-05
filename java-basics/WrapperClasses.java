public class WrapperClasses {
    public static void main(String[] args) {
        // Wrapper: Use primitive data types as reference data types.
        // Slower than primitive, but comes with a lot of useful methods.
        // Eg. int -> Integer, double -> Double

        Boolean isCorrect = true;
        Character c = '@';
        Integer someNumber = 100;
        Double pi = 3.14;
        String name = "Vikram";

        // Autoboxing: automatic conversion of primitive values to reference values.
        // Unboxing: reverse of autoboxing.

        System.out.println(isCorrect.toString());
        System.out.println(c.charValue());
        System.out.println(someNumber.toString());
        System.out.println(pi.isNaN());
        System.out.println(name.toLowerCase());
    }
}
