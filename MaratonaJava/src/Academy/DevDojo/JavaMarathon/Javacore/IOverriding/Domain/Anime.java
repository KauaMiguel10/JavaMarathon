package Academy.DevDojo.JavaMarathon.Javacore.IOverriding.Domain;

public class Anime{
    private String name;

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
