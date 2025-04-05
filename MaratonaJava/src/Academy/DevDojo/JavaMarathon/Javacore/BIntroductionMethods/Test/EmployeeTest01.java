package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Test;

import Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setName("Sanji");
        employee.setAge(23);
        employee.setSalaries(new double[]{1200, 987.32, 2000});

        employee.printEmployee();
        System.out.println(employee.getMedia());

    }


}
