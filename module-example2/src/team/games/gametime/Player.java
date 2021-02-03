package games.gametime;

public class Player {

    private final String name;
    private final String position;
    private final int status;

    public Player(String newName, String newPosition, int newStatus) {
        this.name = newName;
        this.position = newPosition;
        this.status = newStatus;
    }

    public String getName() { return this.name; }
    public String getPosition() { return this.position; }
    public int getStatus() { return this.status; }

    public static int STARTER = 1;

}