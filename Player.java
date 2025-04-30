// Player.java
public class Player extends SportTeam {
    private String playerName;
    private String position;
    private int age;

    public Player(String sportTeamName, String city, int championshipsWon, String coach, String jerseyNo,
                  String playerName, String position, int age) throws InvalidSportTeamDataException {
        super(sportTeamName, city, championshipsWon, coach, jerseyNo);
        if (playerName == null || playerName.isEmpty())
            throw new InvalidSportTeamDataException("Player name cannot be empty.");
        if (position == null || position.isEmpty())
            throw new InvalidSportTeamDataException("Position cannot be empty.");
        if (age < 0)
            throw new InvalidSportTeamDataException("Age cannot be negative.");

        this.playerName = playerName;
        this.position = position;
        this.age = age;
    }

    public String getPlayerName() { return playerName; }
    public String getPosition() { return position; }
    public int getAge() { return age; }

    public void setPlayerName(String playerName) throws InvalidSportTeamDataException {
        if (playerName == null || playerName.isEmpty())
            throw new InvalidSportTeamDataException("Player name cannot be empty.");
        this.playerName = playerName;
    }

    public void setPosition(String position) throws InvalidSportTeamDataException {
        if (position == null || position.isEmpty())
            throw new InvalidSportTeamDataException("Position cannot be empty.");
        this.position = position;
    }

    public void setAge(int age) throws InvalidSportTeamDataException {
        if (age < 0)
            throw new InvalidSportTeamDataException("Age cannot be negative.");
        this.age = age;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.printf("PlayerName: %s\nPosition: %s\nAge: %d\n", playerName, position, age);
    }
}
