package Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain;

import java.io.FileNotFoundException;


public class Person {

    public void save() throws LoginInvalidException, FileNotFoundException {
        System.out.println("Saving person");

    }
}
