package Spring2023.CT3.SecC.SetA.OneAndTwo;

public class Dancer extends Performer {
    private int rank;

    public Dancer(String name, String field, int rank) {
        super(name, field);
        this.rank = rank;
    }

    @Override
    public void perform() {}

    @Override
    public float getRank() {
        return rank;
    }
}