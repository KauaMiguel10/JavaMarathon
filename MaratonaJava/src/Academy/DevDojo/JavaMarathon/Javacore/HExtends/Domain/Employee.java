package Academy.DevDojo.JavaMarathon.Javacore.HExtends.Domain;

public class Employee extends Person {

    private double salary;
    static{
        System.out.println("Inside static block Employee");
    }
    {
        System.out.println("Inside the non-static block Employee 1");
    }
    {
        System.out.println("Inside the non-static block Employee 2");
    }
    public Employee(String name){
        super(name);
        System.out.println("Constructor Employee");
    }

    public void print(){
        super.print();
        System.out.println(this.salary);
    }

    public void paymentReport(){
        System.out.println("I " + name + " received the salary of" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
