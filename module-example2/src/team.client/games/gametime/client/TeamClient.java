package games.gametime.client;

import java.util.logging.Level;
import java.util.logging.Logger;
import games.gametime.Team;
import games.gametime.michigan.Michigan;
import games.gametime.minnesota.Minnesota;


public class TeamClient {

    private static final Logger log = Logger.getLogger(TeamClient.class.getName());

    public static void main(String[] args) {

        
        log.info("Hello World from logger");
        Team michigan = new Michigan();
        Team minnesota = new Minnesota();

        log.info(michigan.getName());
        michigan.getAllPlayers().stream().forEach( i-> {
            log.info("player :" + i.getName() + " position: " + i.getPosition());
        });

        log.info(minnesota.getName());
        minnesota.getAllPlayers().stream().forEach( i-> {
            log.info("player :" + i.getName() + " position: " + i.getPosition());
        });
        
    }
    
}
