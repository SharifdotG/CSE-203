package Spring2023.CT2.SecC.SetA;

public class Forest {
    public static void main(String[] args) {
        // Create an object of Monkey class for monkey1 with breed, weight, and height
        Monkey monkey1 = new Monkey("Pigmy", 0.25f, 0.5f);

        // Create an object of Monkey class for monkey2 with breed, weight, and height
        Monkey monkey2 = new Monkey("Mandril", 0.25f, 0.45f);

        // Call the eat method for monkey1 with foodWeight 0.1
        monkey1.eat(0.1f); // 0.35

        // Set the animalClass to "Spinal" using the class (static variable)
        Monkey.animalClass = "Spinal";

        // Call the grow method for monkey2
        monkey2.grow(); // 0.55

        // Call the display method for both monkey1 and monkey2
        monkey1.display();
        monkey2.display();
    }
}

