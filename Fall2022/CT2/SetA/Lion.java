package Fall2022.CT2.SetA;

public class Lion {
    public String species;
    public String color;
    public double weight;

    public Lion(String species, String color, double weight) {
        this.species = species;
        this.color = color;
        this.weight = weight;
    }

    public void hunt(String prey) {
        System.out.println(species + " like to hunt " + prey + ".");
    }

    public double getWeight() {
        return weight;
    }

    public void display() {
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}
