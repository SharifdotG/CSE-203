package Spring2023.CT3.SecB.SetB.One;

public class Singer extends Musician {
    private int noOfRecords;

    public Singer(String name, String field, int noOfRecords) {
        super(name, field);
        this.noOfRecords = noOfRecords;
    }

    @Override
    public void play(String item) {
        // No implementation is mentioned in the question
        // So leaving it empty!
    }

    @Override
    public int noOfRecords() {
        return noOfRecords;
    }
}