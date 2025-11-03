package tutorial_07.activity1;

public class Employee {
    private final String name;
    private  double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raisedAmount = (salary / 100) * byPercent;
        salary += raisedAmount;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
