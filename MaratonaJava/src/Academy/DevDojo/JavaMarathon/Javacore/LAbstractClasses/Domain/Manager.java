package Academy.DevDojo.JavaMarathon.Javacore.LAbstractClasses.Domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.2;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
