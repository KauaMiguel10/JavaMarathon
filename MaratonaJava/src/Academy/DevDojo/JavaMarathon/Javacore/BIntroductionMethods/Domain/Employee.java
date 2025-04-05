package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double media;

    public void printEmployee() {
        System.out.println("Name = " + this.name);

        System.out.println("Age = " + this.age);

        if (salaries == null) {
            return;
        }
        for (double salary : salaries) {
            System.out.println(salary + " ");
        }

    }

    public void printAverageSalary() {
        if (salaries == null) {
            return;
        }
        double average = 0;
        for (double salary : salaries) {
            average += salary;
        }

        average /= salaries.length;
        System.out.println("\nAverage salary = " + average);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getMedia() {
        return media;
    }


}
