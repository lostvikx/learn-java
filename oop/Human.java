public class Human {
    // Class variables
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        // Instance variables
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Methods
    void introduce() {
        System.out.printf("My name is %s.\n", this.name);
    }

    void eat() {
        System.out.printf("%s is eating.\n", this.name);
    }
}
