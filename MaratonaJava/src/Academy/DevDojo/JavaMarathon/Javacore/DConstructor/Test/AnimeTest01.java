package Academy.DevDojo.JavaMarathon.Javacore.DConstructor.Test;


import Academy.DevDojo.JavaMarathon.Javacore.DConstructor.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação");

        anime.print();

    }
}
