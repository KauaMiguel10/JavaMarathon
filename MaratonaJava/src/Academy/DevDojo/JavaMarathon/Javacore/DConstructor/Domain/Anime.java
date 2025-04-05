package Academy.DevDojo.JavaMarathon.Javacore.DConstructor.Domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String generous;
    private String studio;

    public Anime(String name, String type, int episodes, String generous){
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.generous = generous;
    }

    public Anime(String name, String type, int episodes, String generous, String studio) {
        this(name, type, episodes, generous);
        this.studio = studio;
    }

    public Anime(){

    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.generous);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenerous() {
        return generous;
    }

    public void setGenerous(String generous) {
        this.generous = generous;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
