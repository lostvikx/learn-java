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
    }
}
