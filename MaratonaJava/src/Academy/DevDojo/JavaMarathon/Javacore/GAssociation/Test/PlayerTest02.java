package Academy.DevDojo.JavaMarathon.Javacore.GAssociation.Test;

import Academy.DevDojo.JavaMarathon.Javacore.GAssociation.domain.Player;
import Academy.DevDojo.JavaMarathon.Javacore.GAssociation.domain.Team;

import java.sql.Time;

public class PlayerTest02 {
    public static void main(String[] args) {

        Player p1 = new Player("Pelé");
        Team team = new Team("São paulo");
        p1.setTeam(team);
        p1.print();


    }
}
