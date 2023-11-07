package Spring2023.CT3.SecB.SetB.One;

public abstract class Musician {
    private String name, field;
    
    public Musician(String name, String field) {
        this.name = name;
        this.field = field;
    }

    public abstract void play(String item);
    public abstract int noOfRecords();

    @Override
    public String toString() {
        return String.format("name=%s, field=%s", name, field);
    }
}