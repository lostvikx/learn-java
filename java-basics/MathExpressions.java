import java.util.Scanner;

public class MathExpressions {
    public static void main(String[] args) {
        double pi = 3.14;
        double val = -10;

        double maximum = Math.max(pi, val);
        double absVal = Math.abs(val);

        System.out.println("Max value: " + maximum);
        System.out.println("Absolute value: " + absVal);

        // Compute the hypotenuse of a right angle triangle.
        double x; double y; double z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y:");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("Hypotenuse: " + z);
        
        scanner.close();
    }
}
