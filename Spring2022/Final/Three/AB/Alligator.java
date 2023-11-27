package Spring2022.Final.Three.AB;

public class Alligator {
    private double length;
    private double weight;
    private String color;

    public Alligator(double length, double weight, String color) {
        this.length = length;
        this.weight = weight;
        this.color = color;
    }

    public void incubateEgg(int temp) {
        if (temp >= 34) {
            System.out.println("mostly male baby alligator");
        } else if (temp <= 30) {
            System.out.println("mostly female baby alligator");
        } else {
            System.out.println("could be male or female baby alligator");
        }
    }

    @Override
    public String toString() {
        return "Alligator: [Length = " + length + ", Weight = " + weight + ", Color = " + color + "]";
    }
}