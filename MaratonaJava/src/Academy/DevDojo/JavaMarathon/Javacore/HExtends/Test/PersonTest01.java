package Academy.DevDojo.JavaMarathon.Javacore.HExtends.Test;

import Academy.DevDojo.JavaMarathon.Javacore.HExtends.Domain.Address;
import Academy.DevDojo.JavaMarathon.Javacore.HExtends.Domain.Employee;
import Academy.DevDojo.JavaMarathon.Javacore.HExtends.Domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {

        Person person = new Person("Kauã");
        Address address = new Address();

        address.setName("Road 3");
        address.setZipCode("37003742");


        person.setAge(19);
        person.setAddress(address);
        person.print();

        System.out.println("------------------------");

        Employee employee = new Employee("Oda");

        employee.setAge(23);
        employee.setAddress(address);
    }
}
