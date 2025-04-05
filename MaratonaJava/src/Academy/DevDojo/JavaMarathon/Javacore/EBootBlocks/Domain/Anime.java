package Academy.DevDojo.JavaMarathon.Javacore.EBootBlocks.Domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        System.out.println("Boot block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episodie : this.episodes) {
            System.out.print(episodie + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
