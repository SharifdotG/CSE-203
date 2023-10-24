package Question4;

import java.io.Serializable;

public class Wrestler implements Serializable {
    private String name;
    private int age;
    private String finishingMove;

    public Wrestler(String name, int age, String finishingMove) {
        this.name = name;
        this.age = age;
        this.finishingMove = finishingMove;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + finishingMove;
    }
}
