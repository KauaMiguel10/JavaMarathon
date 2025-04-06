package Academy.DevDojo.JavaMarathon.Javacore.OException.exception.test;

import Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain.Employee;
import Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain.LoginInvalidException;
import Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverloadException {
    public static void main(String[] args) {

        Person person = new Person();
        Employee employee = new Employee();
        try {
            employee.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}
