import java.util.ArrayList;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    // Constructor overloading: Same name, but different params.
    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    void listIngredients() {
        ArrayList<String> ingredients = new ArrayList<String>();
        
        ingredients.add(bread);
        ingredients.add(sauce);
        ingredients.add(cheese);
        ingredients.add(topping);

        System.out.println("Ingredients: ");
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i) != null) {
                System.out.printf("%d. %s\n", i+1, ingredients.get(i).toUpperCase());
            }
        }
    }
}
