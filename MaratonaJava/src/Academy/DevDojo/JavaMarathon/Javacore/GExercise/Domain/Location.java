package Academy.DevDojo.JavaMarathon.Javacore.GExercise.Domain;

public class Location {
    private String address;
    private Location[] location;

    public Location(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
