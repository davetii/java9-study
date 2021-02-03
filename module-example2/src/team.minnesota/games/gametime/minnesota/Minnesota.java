package games.gametime.minnesota;

import games.gametime.Player;
import games.gametime.Team;
import static games.gametime.Player.STARTER;
import java.util.List;
import java.util.ArrayList;

public class Minnesota implements Team {

    public List<Player> getAllPlayers() {

        List<Player> players = new ArrayList();
        players.add(new Player("Sidney Moncrief" , "Point Guard", STARTER));
        players.add(new Player("Britny Carter" , "2 Guard", STARTER));
        players.add(new Player("Sandie Brodie" , "Forward", STARTER));
        players.add(new Player("Randell Riggs" , "Power Forward", STARTER));
        players.add(new Player("Junoir Miller" , "Center", STARTER));
        return players;
    }

    public String getName() { return "Minnesota Timberwolves"; }

}
