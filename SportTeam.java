// SportTeam.java
public class SportTeam {
    //SportTeam Fields
    private String sportTeamName;
    private String city;
    private int championshipsWon;
    private String coach;
    private String jerseyNumber;

    //Constructors
    public SportTeam(String sportTeamName, String city, int championshipsWon, String coach, String jerseyNo)
            throws InvalidSportTeamDataException {
        if (sportTeamName == null || sportTeamName.isEmpty())
            throw new InvalidSportTeamDataException("SportTeamName cannot be empty.");
        if (city == null || city.isEmpty())
            throw new InvalidSportTeamDataException("City cannot be empty.");
        if (championshipsWon < 0)
            throw new InvalidSportTeamDataException("ChampionshipsWon cannot be negative.");
        if (coach == null || coach.isEmpty())
            throw new InvalidSportTeamDataException("Coach cannot be empty.");
        if (jerseyNumber == null || jerseyNumber.isEmpty())
            throw new InvalidSportTeamDataException("jerseyNumber cannot be empty.");

        this.sportTeamName = sportTeamName;
        this.city = city;
        this.championshipsWon = championshipsWon;
        this.coach = coach;
        this.jerseyNo = jerseyNumber;
    }

    //Getter for SportTeamName
    public String getSportTeamName() {
        return sportTeamName;
    }
    
    //Getter for City
    public String getCity() {
        return city;
    }
    
    //Getter for ChampionshipsWon
    public int getChampionshipsWon() {
        return championshipsWon;
    }
    
    //Getter for Coach
    public String getCoach() {
        return coach;
    }
    
    //Getter for JerseyNumber
    public String getJerseyNumber() {
        return jerseyNumber;
    }

    //Setter for SportTeamName
    public void setSportTeamName(String sportTeamName) throws InvalidSportTeamDataException {
        if (sportTeamName == null || sportTeamName.isEmpty())
            throw new InvalidSportTeamDataException("SportTeamName cannot be empty.");
        this.sportTeamName = sportTeamName;
    }

    //Setter for City
    public void setCity(String city) throws InvalidSportTeamDataException {
        if (city == null || city.isEmpty())
            throw new InvalidSportTeamDataException("City cannot be empty.");
        this.city = city;
    }

    //Setter for ChampionshipsWon
    public void setChampionshipsWon(int championshipsWon) throws InvalidSportTeamDataException {
        if (championshipsWon < 0)
            throw new InvalidSportTeamDataException("ChampionshipsWon cannot be negative.");
        this.championshipsWon = championshipsWon;
    }

    //Setter for Coach
    public void setCoach(String coach) throws InvalidSportTeamDataException {
        if (coach == null || coach.isEmpty())
            throw new InvalidSportTeamDataException("Coach cannot be empty.");
        this.coach = coach;
    }

    //Setter for JerseyNumber
    public void setJerseyNumber(String jerseyNumber) throws InvalidSportTeamDataException {
        if (jerseyNumber == null || jerseyNumber.isEmpty())
            throw new InvalidSportTeamDataException("jerseyNumber cannot be empty.");
        this.jerseyNumber = jerseyNumber;
    }

    //Display Method
    public void displayData() {
        System.out.printf("SportTeamName: %s\nCity: %s\nChampionshipsWon: %d\nCoach: %s\nJerseyNumber: %s\n",
                sportTeamName, city, championshipsWon, coach, jerseyNumber);
    }
}

