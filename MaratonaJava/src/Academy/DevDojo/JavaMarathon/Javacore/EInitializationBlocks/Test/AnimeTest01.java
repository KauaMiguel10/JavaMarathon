package Academy.DevDojo.JavaMarathon.Javacore.EInitializationBlocks.Test;

import Academy.DevDojo.JavaMarathon.Javacore.EInitializationBlocks.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
