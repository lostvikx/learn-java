import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList: A resizable array.
        // Element can be added/removed. Also store reference data types.

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Hotdog");

        food.set(0, "Sushi");
        food.remove(2);
        // food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        System.out.println("---------");

        // 2D ArrayLists:
        ArrayList<String> bakery = new ArrayList<String>();
        bakery.add("Pasta");
        bakery.add("Garlic Bread");
        bakery.add("Donut");

        ArrayList<String> produce = new ArrayList<String>();
        produce.add("Tomatoes");
        produce.add("Peppers");

        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("Coffee");
        drinks.add("Soda");

        ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();
        grocery.add(bakery);
        grocery.add(produce);
        grocery.add(drinks);

        System.out.println(grocery);
    }
}
