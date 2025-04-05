package Academy.DevDojo.JavaMarathon.Javacore.AIntroductionClass.Test;

import Academy.DevDojo.JavaMarathon.Javacore.AIntroductionClass.Domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.name = " Kami ";
        teacher.age = 140;
        teacher.sex = 'M';

        System.out.println(" Name =" + teacher.name + " Age = " + teacher.age + " Sex = " + teacher.sex);
    }
}
