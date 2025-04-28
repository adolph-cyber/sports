//SportTeam.java
public class SportTeam {

    // SportTeam Fields
    private String SportTeamName;
    private String City;
    private int ChampionshipsWon;
    private String Coach;
    private String jerseyNo;

    // Constructors to initialize
    public SportTeam(String SportTeamName, String City, int ChampionshipsWon, String Coach, String jerseyNo)
            throws InvalidSportTeamDataException {
        if (SportTeamName == null || SportTeamName.isEmpty()) {
            throw new InvalidSportTeamDataException("SportTeamName cannot be empty.");
        }
        if (City == null || City.isEmpty()) {
            throw new InvalidSportTeamDataException("City cannot be empty.");
        }
        if (ChampionshipsWon < 0) {
            throw new InvalidSportTeamDataException("ChampionshipsWon cannot be negative.");
        }
        if (Coach == null || Coach.isEmpty()) {
            throw new InvalidSportTeamDataException("Coach cannot be empty.");
        }
        if (jerseyNo == null || jerseyNo.isEmpty()) {
            throw new InvalidSportTeamDataException("jerseyNo cannot be empty.");
        }
        this.SportTeamName = SportTeamName;
        this.City = City;
        this.ChampionshipsWon = ChampionshipsWon;
        this.Coach = Coach;
        this.jerseyNo = jerseyNo;
    }

    // Getter for SportTeamName
    public String getSportTeamName() {
        return SportTeamName;
    }

    public int getChampionshipsWon() {
        return ChampionshipsWon;
    }

    // Getter for Coach
    public String getCoach() {
        return Coach;
    }

    // Getter for City
    public String getCity() {
        return City;
    }

    public String getjerseyNo() {
        return jerseyNo;
    }

    // Setter for SportTeamName
    public void setSportTeamName(String SportTeamName) throws InvalidSportTeamDataException {
        if (SportTeamName == null || SportTeamName.isEmpty()) {
            throw new InvalidSportTeamDataException("SportTeamName cannot be empty.");
        }
        this.SportTeamName = SportTeamName;
    }

    // Setter for ChampionshipsWon
    public void setChampionshipsWon(int ChampionshipsWon) throws InvalidSportTeamDataException {
        if (ChampionshipsWon < 0) {
            throw new InvalidSportTeamDataException("ChampionshipsWon cannot be negative.");
        }
        this.ChampionshipsWon = ChampionshipsWon;
    }

    // Setter for Coach
    public void setCoach(String Coach) throws InvalidSportTeamDataException {
        if (Coach == null || Coach.isEmpty()) {
            throw new InvalidSportTeamDataException("Coach cannot be empty.");
        }
        this.Coach = Coach;
    }

    // Setter for City
    public void setCity(String City) throws InvalidSportTeamDataException {
        if (City == null || City.isEmpty()) {
            throw new InvalidSportTeamDataException("City cannot be empty.");
        }
        this.City = City;
    }

    public void setjerseyNo(String jerseyNo) throws InvalidSportTeamDataException {
        if (jerseyNo == null || jerseyNo.isEmpty()) {
            throw new InvalidSportTeamDataException("jerseyNo cannot be empty.");
        }
        this.jerseyNo = jerseyNo;
    }

    // Display Methods
    public void displayData() {
        System.out.printf("SportTeamName:%s\n City:%s\n championshipWon:%d\n Coach:%s\n jerseyNo:%s\n",
                SportTeamName, City, ChampionshipsWon, Coach, jerseyNo);
    }
}
