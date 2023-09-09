package Spring2023.CT2.SecC.SetA;

public class Monkey {
    private String breed;
    private float weight;
    private float height;
    static String animalClass = "Vertebrates";

    // Parameterized constructor
    public Monkey(String breed, float weight, float height) {
        this.breed = breed;
        this.weight = weight;
        this.height = height;
    }

    // Method to simulate eating
    public void eat(float foodWeight) {
        weight += foodWeight;
    }

    // Method to simulate growth
    public void grow() {
        height += 0.1f;
    }

    // Method to display attributes
    public void display() {
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " meters");
        System.out.println("Animal Class: " + animalClass);
    }
}

