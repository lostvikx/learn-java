public class StringMethods {
    public static void main(String[] args) {
        String name = "Vikram";

        boolean isEqual = name.equals("Vikram");
        System.out.println("Equal to 'Vikram': " + isEqual);

        int len = name.length();
        System.out.println("Length: " + len);

        char c = name.charAt(0);
        System.out.println("Char at index 0: " + c);

        int idx = name.indexOf("a");
        System.out.println("Index of 'a': " + idx);

        String subName = name.substring(3);
        System.out.println("Substring: " + subName);

        boolean isEmpty = name.isEmpty();
        System.out.println("Empty string: " + isEmpty);

        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lower: " + lower);

        String newName = name.replace('k', 'j');
        System.out.println("New name: " + newName);
    }
}
