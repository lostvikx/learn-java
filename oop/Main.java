// Object: An instance of a class that may contain: attributes and methods.
// Constructor: Special method called when a class is instantiated (created).

public class Main {
    public static void main(String[] args) {
        // Basics
        Car myCar = new Car();  // Instantiation of a class.

        System.out.println("Make: " + myCar.make);
        System.out.printf("Price: $ %,.2f\n", myCar.price);
        
        myCar.drive();
        myCar.brake();

        System.out.println("---------");

        // Custom class instance
        Human woman = new Human("Anne", 16, 52.28);
        System.out.println("Hello, " + woman.name + "!");

        Human man = new Human("Bob", 27, 71.57);
        man.introduce();
        woman.eat();

        System.out.println("---------");

        // Local variables vs. global variables
        DiceRoller dice = new DiceRoller();
        dice.roll();

        System.out.println("---------");

        // Constructor overloading
        Pizza pizza = new Pizza("thin crust", "tomato", "mozzarella");
        pizza.listIngredients();

        System.out.println("---------");

        // Print objects using toString method: special method that all objects inherit
        Human person = new Human("Emma", 24, 55.74);

        // System.out.println(person);  // Prints the address of `person` object in memory. Eg. Object@MemoryAddress
        // System.out.println(person.name);
        // System.out.println(person.age);
        // System.out.println(person.weight);

        System.out.println(person.toString());  // or simply print `person` object.

        System.out.println("---------");

        // Array of objects
        // int[] numbers = new int[3];  // examples
        // String[] items = new String[3];
        // Food[] refrigerator = new Food[3];
        
        Food item1 = new Food("Pizza");
        Food item2 = new Food("Burger");
        Food item3 = new Food("Hotdog");

        Food[] refrigerator = {item1, item2, item3};  // Array of Objects

        System.out.println("Items in refrigerator:");
        for (int i = 0; i < refrigerator.length; i++) {
            System.out.printf("%d. %s\n", i+1, refrigerator[i].name);
        }

        System.out.println("---------");
    }
}
