import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
        // These are pseudo-random numbers.
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(0, 10);  // 10 is not included.
            System.out.println("Random int: " + x);
        }

        double y = random.nextDouble(0, 1);
        System.out.println("Random probability: " + String.format("%.2f", y));  // String formating.

        boolean isHead = random.nextBoolean();
        System.out.println("Is it heads? " + isHead);
    }
}
