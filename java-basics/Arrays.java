public class Arrays {
    public static void main(String[] args) {
        // Array: used to store multiple values in a single variables.

        String[] cars = { "Ferrari", "Tesla", "Corvette" };

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Alterative
        // String[] cars = new String[3];

        // cars[0] = "Ferrari";
        // cars[1] = "Tesla";
        // cars[2] = "Corvette";

        // for (String car : cars) {
        //     System.out.println(car);
        // }

        // 2D Arrays: Array of arrays.

        String[][] letters = {
            { "A", "B", "C" },
            { "D", "E", "F" },
            { "G", "H", "I" }
        };

        for (int i = 0; i < letters.length; i++) {
            System.out.println();
            for (int j = 0; j < letters[i].length; j++) {
                System.out.print(letters[i][j] + " ");
            }
        }

        // for (String[] row : letters) {
        //     System.out.println();
        //     for (String alpha : row) {
        //         System.out.print(alpha + " ");
        //     }
        // }
        System.out.println();
    }
}
