package basics;

public class Swap {
    public static void main(String[] args) {
        String x = "Messi";
        String y = "Ronaldo";

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // Need to use a temp variable.
        String temp = null;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
