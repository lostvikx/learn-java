import java.util.Random;

public class DiceRoller {
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
    }

    void roll() {
        number = random.nextInt(1, 7);
        System.out.println("Dice Roll: " + number);
    }
}
