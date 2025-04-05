package Academy.DevDojo.JavaMarathon.Javacore.COverloadingMethods.Test;

import Academy.DevDojo.JavaMarathon.Javacore.COverloadingMethods.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");

        anime.print();
    }
}
