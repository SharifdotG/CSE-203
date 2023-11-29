package Fall2022.Final.Five.A;

public class Voter {
    private String name;
    private int age;

    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void grow() {
        age++;
    }
    
    // Overloaded method for grow
    public int grow(int years) {
        return age += years;
    }
}
