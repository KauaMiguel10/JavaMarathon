package Academy.DevDojo.JavaMarathon.Javacore.GExercise.Domain;

public class Teacher {
    private String name;
    private String specialty;
    private School[] school;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, School[] school) {
        this.name = name;
        this.specialty = specialty;
        this.school = school;
    }

    public void print() {
        System.out.println("----------------------------");
        System.out.println("Name: " + this.name);
        if (this.school == null) return;
        System.out.println("## Schools ##");
        for (School school : school) {
            System.out.println(school.getTitle());
            System.out.println(school.getLocation().getAddress());
            if (school.getStudent() == null || school.getStudent().length==0) continue;
            System.out.println("** Students **");
            for (Student student : school.getStudent()) {
                System.out.println("Student: " + student.getName() + " \nage: " + student.getAge());
            }

        }


    }

    public School[] getSchool() {
        return school;
    }

    public void setSchool(School[] school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
