package games.gametime.michigan;

import java.util.List;
import java.util.ArrayList;
import games.gametime.Player;
import games.gametime.Team;
import static games.gametime.Player.STARTER;

public class Michigan implements Team {

    public List<Player> getAllPlayers() {
        List<games.gametime.Player> players = new ArrayList();
        players.add(new games.gametime.Player("Dave Turner" , "Point Guard", STARTER));
        players.add(new games.gametime.Player("Daryl Strawberry" , "2 Guard",STARTER));
        players.add(new games.gametime.Player("Viktor Wooten" , "Forward", STARTER));
        players.add(new games.gametime.Player("Dan Roundfiled" , "Power Forward", STARTER));
        players.add(new games.gametime.Player("Lee Roy Selmon" , "Center", STARTER));
        return players;
    }

    public String getName() { return "Michigan Panthers"; }
    
    
}
