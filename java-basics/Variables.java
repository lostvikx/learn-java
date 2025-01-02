// There are 8 primitive data types: boolean (*), byte, short, int (*), long, float, double (*), char (*)
// and a reference data type: String (*)
// (*) - Important data types.

// char: single quotes
// String: double quotes (sequence of chars)

public class Variables {
    public static void main(String[] args) {
            int x;  // declaration
            x = 10;  // assignment
            // int x = 10;  // initialization

            double pi = 3.14;

            System.out.println("Due: Rs. " + (x + 100));
            System.out.println("Value of pi: " + pi);

            boolean isCorrect = true;
            if (isCorrect) {
                System.out.println("The answer is correct.");
            }

            char symbol = '@';
            String username = "lostvikx";

            System.out.println("Follow: " + symbol + username);

            // String concatenation rule: (Left to Right)
            String str = 50 + 30 + "Rose" + 40 + 40;
            System.out.println(str);
    }
}
