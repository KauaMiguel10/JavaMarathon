package Academy.DevDojo.JavaMarathon.Javacore.GAssociation.Test;

import Academy.DevDojo.JavaMarathon.Javacore.GAssociation.domain.Player;
import Academy.DevDojo.JavaMarathon.Javacore.GAssociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {

        Team team = new Team("Seleção Brasileira");
        Player player1 = new Player("Cafu");
        Player player2 = new Player("Pelé");

        Player[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        player1.print();
        player2.print();

    }
}
