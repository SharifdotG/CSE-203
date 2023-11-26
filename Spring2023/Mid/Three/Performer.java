package Spring2023.Mid.Three;

public class Performer {
    String name, field;
    
    public Performer(String name, String field) {
        this.name = name;
        this.field = field;
    }

    public void perform() {
        System.out.println("Performing...");
    }

    public void rehearse() {
        System.out.println("Practicing...");
    }
    
    @Override
    public String toString() {
        return String.format("name=%s, field=%s", name, field);
    }
}
