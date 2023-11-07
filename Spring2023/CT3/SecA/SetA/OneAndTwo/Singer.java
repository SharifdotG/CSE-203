package Spring2023.CT3.SecA.SetA.OneAndTwo;

public class Singer extends Musician {
    private int noOfRecords;

    public Singer(String name, String field, int noOfRecords) {
        super(name, field);
        this.noOfRecords = noOfRecords;
    }

    @Override
    public void play() {}

    @Override
    public int getNoOfRecords() {
        return noOfRecords;
    }
}
