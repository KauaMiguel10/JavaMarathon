package Academy.DevDojo.JavaMarathon.Javacore.LAbstractClasses.Test;

import Academy.DevDojo.JavaMarathon.Javacore.LAbstractClasses.Domain.Developer;
import Academy.DevDojo.JavaMarathon.Javacore.LAbstractClasses.Domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {

        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Touya", 12000);
        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();

    }
}
