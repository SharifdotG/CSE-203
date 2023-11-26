package Spring2023.CT3.SecC.SetA.OneAndTwo;

public abstract class Performer {
    private String name, field;

    public Performer(String name, String field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Field: " + field;
    }

    public abstract void perform();
    public abstract float getRank();
}