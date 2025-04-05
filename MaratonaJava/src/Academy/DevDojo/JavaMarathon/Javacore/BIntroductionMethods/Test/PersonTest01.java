package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Test;

import Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Jiraya");
        person.setAge(10);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
