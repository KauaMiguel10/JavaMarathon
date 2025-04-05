package Academy.DevDojo.JavaMarathon.Javacore.AIntroductionClass.Test;

import Academy.DevDojo.JavaMarathon.Javacore.AIntroductionClass.Domain.Studant;

public class StudantTest {
    public static void main(String[] args) {

        Studant studant = new Studant();

        studant.name = "Goku";
        studant.age = 18;
        studant.sex = 'M';

        System.out.println(studant.name);
        System.out.println(studant.age);
        System.out.println(studant.sex);
        System.out.println(studant);
    }
}
