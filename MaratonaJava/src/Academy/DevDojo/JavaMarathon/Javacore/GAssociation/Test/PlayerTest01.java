package Academy.DevDojo.JavaMarathon.Javacore.GAssociation.Test;

import Academy.DevDojo.JavaMarathon.Javacore.GAssociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {

        Player player1 = new Player("Cafu");
        Player player2 = new Player("Romario");
        Player player3 = new Player("Ronaldo");

        Player[] players ={player1,player2,player3};
        for (Player player : players) {
           player.print();
        }
    }
}
