package Fall2022.CT2.SetE;

public class Shark {
    private String species;
    private String color;
    private double weight;

    public Shark(String species, String color, double weight) {
        this.species = species;
        this.color = color;
        this.weight = weight;
    }

    public void hunt(String prey, double pWgt) {
        System.out.println(species + " like to hunt " + prey + ".");
        weight += pWgt;
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

