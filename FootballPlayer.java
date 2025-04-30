// FootballPlayer.java
public class FootballPlayer extends Player {
    private String sport;

    public FootballPlayer(String sportTeamName, String city, int championshipsWon, String coach, String jerseyNo,
                          String playerName, String position, int age, String sport) throws InvalidSportTeamDataException {
        super(sportTeamName, city, championshipsWon, coach, jerseyNo, playerName, position, age);
        if (sport == null || sport.isEmpty())
            throw new InvalidSportTeamDataException("Sport cannot be empty.");
        this.sport = sport;
    }

    public String getSport() { return sport; }

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
