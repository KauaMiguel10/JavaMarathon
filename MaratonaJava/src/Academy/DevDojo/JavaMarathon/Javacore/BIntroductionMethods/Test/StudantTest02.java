package Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Test;

import Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain.PrintStudant;
import Academy.DevDojo.JavaMarathon.Javacore.BIntroductionMethods.Domain.Studant;

public class StudantTest02 {
    public static void main(String[] args) {

        Studant studant01 = new Studant();
        Studant studant02 = new Studant();


        studant01.name = "Midoriya";
        studant01.age = 15;
        studant01.sex = 'M';

        studant02.name = "Sakura";
        studant02.age = 16;
        studant02.sex = 'F';

        studant01.printStudant();

        System.out.println("------------------------------");

        studant02.printStudant();


    }
}
