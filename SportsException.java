// SportTeam.java
public class SportException {

    // Fields
    private String sportTeamName;
    private String city;
    private int championshipsWon;
    private String coach;
    private String jerseyNo;

    // Constructor with validation
    public SportTeam(String sportTeamName, String city, int championshipsWon, String coach, String jerseyNo) throws TeamException {
        setSportTeamName(sportTeamName);
        setCity(city);
        setChampionshipsWon(championshipsWon);
        setCoach(coach);
        setJerseyNo(jerseyNo);
    }

    // Getter and Setter for sportTeamName
    public String getSportTeamName() {
        return sportTeamName;
    }

    public void setSportTeamName(String sportTeamName) throws TeamException {
        if (sportTeamName == null || sportTeamName.trim().isEmpty()) {
            throw new TeamException("Sport team name cannot be empty.");
        }
        this.sportTeamName = sportTeamName;
    }

    // Getter and Setter for championshipsWon
    public int getChampionshipsWon() {
        return championshipsWon;
    }

    public void setChampionshipsWon(int championshipsWon) throws TeamException {
        if (championshipsWon < 0) {
            throw new TeamException("Championships won cannot be negative.");
        }
        this.championshipsWon = championshipsWon;
    }

    // Getter and Setter for coach
    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) throws TeamException {
        if (coach == null || coach.trim().isEmpty()) {
            throw new TeamException("Coach name cannot be empty.");
        }
        this.coach = coach;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) throws TeamException {
        if (city == null || city.trim().isEmpty()) {
            throw new TeamException("City cannot be empty.");
        }
        this.city = city;
    }

    // Getter and Setter for jerseyNo
    public String getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(String jerseyNo) throws TeamException {
        if (jerseyNo == null || jerseyNo.trim().isEmpty()) {
            throw new TeamException("Jersey number cannot be empty.");
        }
        this.jerseyNo = jerseyNo;
    }

    @Override
    public String toString() {
        return "SportTeam\n" +
                "SportTeamName: " + sportTeamName +
                ", City: " + city +
                ", ChampionshipsWon: " + championshipsWon +
                ", Coach: " + coach +
                ", JerseyNo: " + jerseyNo;
    }
}
