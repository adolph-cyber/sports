// SportTeam.java
public class SportTeam {
    private String sportTeamName;
    private String city;
    private int championshipsWon;
    private String coach;
    private String jerseyNo;

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
        if (jerseyNo == null || jerseyNo.isEmpty())
            throw new InvalidSportTeamDataException("jerseyNo cannot be empty.");

        this.sportTeamName = sportTeamName;
        this.city = city;
        this.championshipsWon = championshipsWon;
        this.coach = coach;
        this.jerseyNo = jerseyNo;
    }

    public String getSportTeamName() { return sportTeamName; }
    public String getCity() { return city; }
    public int getChampionshipsWon() { return championshipsWon; }
    public String getCoach() { return coach; }
    public String getJerseyNo() { return jerseyNo; }

    public void setSportTeamName(String sportTeamName) throws InvalidSportTeamDataException {
        if (sportTeamName == null || sportTeamName.isEmpty())
            throw new InvalidSportTeamDataException("SportTeamName cannot be empty.");
        this.sportTeamName = sportTeamName;
    }

    public void setCity(String city) throws InvalidSportTeamDataException {
        if (city == null || city.isEmpty())
            throw new InvalidSportTeamDataException("City cannot be empty.");
        this.city = city;
    }

    public void setChampionshipsWon(int championshipsWon) throws InvalidSportTeamDataException {
        if (championshipsWon < 0)
            throw new InvalidSportTeamDataException("ChampionshipsWon cannot be negative.");
        this.championshipsWon = championshipsWon;
    }

    public void setCoach(String coach) throws InvalidSportTeamDataException {
        if (coach == null || coach.isEmpty())
            throw new InvalidSportTeamDataException("Coach cannot be empty.");
        this.coach = coach;
    }

    public void setJerseyNo(String jerseyNo) throws InvalidSportTeamDataException {
        if (jerseyNo == null || jerseyNo.isEmpty())
            throw new InvalidSportTeamDataException("jerseyNo cannot be empty.");
        this.jerseyNo = jerseyNo;
    }

    public void displayData() {
        System.out.printf("SportTeamName: %s\nCity: %s\nChampionshipsWon: %d\nCoach: %s\nJerseyNo: %s\n",
                sportTeamName, city, championshipsWon, coach, jerseyNo);
    }
}

