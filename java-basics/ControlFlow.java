public class ControlFlow {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("ACCESS: Okay, you can view the content.");
        } else if (age < 0) {
            System.out.println("ERROR: Incorrect age!");
        } else {
            System.out.println("RESTRICTED: You cannot view the content.");
        }

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

    }
}
