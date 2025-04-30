// FootballPlayer.java
public class FootballPlayer extends Player {
    //Field
    private String sport;

    //Constructor
    public FootballPlayer(String sportTeamName, String city, int championshipsWon, String coach, String jerseyNo,
                          String playerName, String position, int age, String sport) throws InvalidSportTeamDataException {
        super(sportTeamName, city, championshipsWon, coach, jerseyNo, playerName, position, age);
        if (sport == null || sport.isEmpty())
            throw new InvalidSportTeamDataException("Sport cannot be empty.");
        this.sport = sport;
    }

    //Getter for Sport
    public String getSport() {
        return sport;
    }

    //Setter for Sport
    public void setSport(String sport) throws InvalidSportTeamDataException {
        if (sport == null || sport.isEmpty())
            throw new InvalidSportTeamDataException("Sport cannot be empty.");
        this.sport = sport;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.printf("Sport: %s\n", sport);
    }
}
