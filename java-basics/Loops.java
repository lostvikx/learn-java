import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        // while loop
        while (name.isBlank()) {
            System.out.println("Enter your name:");
            name = scanner.nextLine();
        }
        System.out.println("Welcome, " + name + "!");

        // Similar to the while loop. Performs the code block at least once.
        int idx = 0;
        do {
            System.out.println("This message will print only once.");
        } while (idx > 0);

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Count: " + i);
        }
        
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        System.out.println("Happy New Year!");

        // Nested Loops
        int rows;
        int cols;
        String symbol = "";

        System.out.println("Enter no. of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter no. of cols: ");
        cols = scanner.nextInt();
        System.out.println("Enter a symbol: ");
        symbol = scanner.next();

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
        }
        System.out.println();

        scanner.close();

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
