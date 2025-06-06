// Captain.java
public class Captain extends FootballPlayer {
    private String leadershipRole;

    public Captain(String sportTeamName, String city, int championshipsWon, String coach, String jerseyNo,
                   String playerName, String position, int age, String sport, String leadershipRole)
            throws InvalidSportTeamDataException {
        super(sportTeamName, city, championshipsWon, coach, jerseyNo, playerName, position, age, sport);
        if (leadershipRole == null || leadershipRole.isEmpty())
            throw new InvalidSportTeamDataException("Leadership role cannot be empty.");
        this.leadershipRole = leadershipRole;
    }

    //Getter for LeadershipRole
    public String getLeadershipRole() {
        return leadershipRole;
    }

    //Setter for LeadershipRole
    public void setLeadershipRole(String leadershipRole) throws InvalidSportTeamDataException {
        if (leadershipRole == null || leadershipRole.isEmpty())
            throw new InvalidSportTeamDataException("Leadership role cannot be empty.");
        this.leadershipRole = leadershipRole;
    }

    @Override
    //Display Method
    public void displayData() {
        super.displayData();
        System.out.printf("Leadership Role: %s\n", leadershipRole);
    }
}
