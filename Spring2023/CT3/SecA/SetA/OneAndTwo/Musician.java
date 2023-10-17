package Spring2023.CT3.SecA.SetA.OneAndTwo;

public abstract class Musician {
    private String name;
    private String field;

    public Musician(String name, String field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Field: " + field;
    }

    public abstract void play();
    public abstract int getNoOfRecords();
}