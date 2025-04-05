package Academy.DevDojo.JavaMarathon.Javacore.LAbstractClasses.Domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    public abstract void calculateBonus();

    @Override
    public void print() {
        System.out.println("Print...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
