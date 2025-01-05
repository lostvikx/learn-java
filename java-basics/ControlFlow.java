import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        // If - Else Statement
        int age = 16;

        if (age >= 18) {
            System.out.println("ACCESS: Okay, you can view the content.");
        } else if (age < 0) {
            System.out.println("ERROR: Incorrect age!");
        } else {
            System.out.println("RESTRICTED: You cannot view the content.");
        }

        // Switch Statement
        String day = "Friday";

        switch (day) {
            case "Sunday":
                System.out.println("Today is a holiday!");
                break;
            
            case "Saturday":
                System.out.println("Today is a half workday.");
                break;

            default:
                System.out.println("Today is a workday.");
                break;
        }

        // Logical Operators: &&: AND, ||: OR, !: NOT
        int temperature = 25;

        if (temperature > 30) {
            System.out.println("It is hot outside.");
        } else if (temperature >= 20 && temperature <=30) {
            System.out.println("It is warm outside.");
        } else {
            System.out.println("It is cold outside.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press q to quit!");
        String response = scanner.next();

        scanner.close();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game.");
        } else {
            System.out.println("Game is still running.");
        }

        Boolean isCorrect = false;
        if (!isCorrect) {
            System.out.println("Answer is incorrect.");
        }
    }
}
