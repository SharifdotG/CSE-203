package Spring2023.CT3.SecC.SetA.OneAndTwo;

public class Dancer extends Performer {
    private float rank;

    public Dancer(String name, String field, float rank) {
        super(name, field); // Call the constructor of the superclass (Performer)
        this.rank = rank;
    }

    @Override
    public void perform() {
        // Implement the perform method for a Dancer
        System.out.println("Dancer is performing.");
    }

    @Override
    public float getRank() {
        // Implement the getRank method for a Dancer
        return rank;
    }
}