package Academy.DevDojo.JavaMarathon.Javacore.GExercise.Test;

import Academy.DevDojo.JavaMarathon.Javacore.GExercise.Domain.Location;
import Academy.DevDojo.JavaMarathon.Javacore.GExercise.Domain.School;
import Academy.DevDojo.JavaMarathon.Javacore.GExercise.Domain.Student;
import Academy.DevDojo.JavaMarathon.Javacore.GExercise.Domain.Teacher;

public class AssociationTest {
    public static void main(String[] args) {


        Student student = new Student("Kauã", 19);
        Teacher teacher1 = new Teacher("Tupac", "rap");
        Student[] studentsSchool = {student};
        Location location = new Location("Wall Street");
        School school = new School("Academy", studentsSchool, location);

        School[] schools = {school};
        teacher1.setSchool(schools);

        teacher1.print();

    }
}
