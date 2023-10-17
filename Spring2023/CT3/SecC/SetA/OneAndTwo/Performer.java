package Spring2023.CT3.SecC.SetA.OneAndTwo;

public abstract class Performer {
    // Attributes
    private String name;
    private String field;

    // Parameterized Constructor
    public Performer(String name, String field) {
        this.name = name;
        this.field = field;
    }

    // Concrete Method: Override toString()
    @Override
    public String toString() {
        return "Name: " + name + ", Field: " + field;
    }

    // Abstract Method: perform (No parameters, No return value)
    public abstract void perform();

    // Abstract Method: getRank (Return a float, No parameters)
    public abstract float getRank();
}