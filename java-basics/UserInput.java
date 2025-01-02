import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();  // If non-int entered, then it will throw an exception.
        // Note: .nextInt leaves a \n character.

        scanner.nextLine();

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        scanner.close();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You like " + food + "!");
    }
}
