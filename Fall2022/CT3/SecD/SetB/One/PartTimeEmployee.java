package Fall2022.CT3.SecD.SetB.One;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public PartTimeEmployee(String name, String id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        // Assuming the employee has worked 100 hours per month
        return 100 * hourlyRate;
    }
}
