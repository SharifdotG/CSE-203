package Fall2022.CT3.SecD.SetB.One;

public class Employee {
    String name, id;
    double salary;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void display() {
        System.out.println(name+":"+id);
    }
}
