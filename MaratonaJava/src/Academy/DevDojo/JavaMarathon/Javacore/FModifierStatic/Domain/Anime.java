package Academy.DevDojo.JavaMarathon.Javacore.FModifierStatic.Domain;

public class Anime {
    private String name;
    private static int[] episodes;

    static {
        System.out.println("Boot block 1");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Boot block 2");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    {
        System.out.println("Boot block 3");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episodie : Anime.episodes) {
            System.out.print(episodie + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
