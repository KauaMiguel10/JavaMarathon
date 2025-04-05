package Academy.DevDojo.JavaMarathon.Javacore.GExercise.Domain;


public class School {
    private String title;
    private Student[] student;
    private Location location;

    public School(String title) {
        this.title = title;
    }

    public School(String title, Student[] student) {
        this.title = title;
        this.student = student;
    }

    public School(String title, Student[] student, Location location) {
        this.title = title;
        this.student = student;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


}
