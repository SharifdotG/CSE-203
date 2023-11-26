package Spring2023.Mid.Three;

public class Singer extends Performer {
    private String songType;

    public Singer(String name, String field, String songType) {
        super(name, field);
        this.songType = songType;
    }

    @Override
    public void perform() {
        System.out.println(name + " is singing " + songType + " song.");
    }

    public static void main(String[] args) {
        Singer sgr = new Singer("Habib", "music", "folk");
        sgr.perform();
        sgr.rehearse();
        System.out.println(sgr);
    }
}