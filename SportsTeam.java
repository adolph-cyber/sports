//SportTeam.java
public class SportTeam{

    //SportTeam Fields
    private String SportTeamName;
    private String City;
    private int ChampionshipsWon;
    private String Coach;
    private String jerseyNo;

    //Constructors to initialize
    public SportTeam(String SportTeamName, String City, int ChampionshipsWon,String Coach, String jerseyNo){
        this.SportTeamName = SportTeamName;
        this.City = City;
        this.ChampionshipsWon = ChampionshipsWon;
        this.Coach = Coach;
        this.jerseyNo=jerseyNo;
    }
    //Getter for SportTeamName
    public String getSportTeamName(){
        return SportTeamName;
    }

    //Setter for SportTeamName
    public void setSportTeamName(String SportTeamName){
        this.SportTeamName = SportTeamName;
    }
    
    //Getter for ChampionshipsWon
    public double getChampionshipsWon(){
        return championshipsWon;
    }

    //Setter for ChampionshipsWon
    Public void setChampionshipsWon(int ChampionshipsWon){
        this.ChampionshipsWon = ChampionshipsWon;
    }

    //Getter for Coach
    public String getCoach(){
        return Coach;
    }

    //Setter for Coach
    public void setCoach(String Coach){
        this.Coach = Coach;
    }

     //Getter for City
    public String getCity(){
        return city;
    }

    //Setter for City
    public void setCity(String City){
        this.City = City;
    }

    public String getjerseyNo(){
       return jerseyNo;
    }

    public void setjerseyNo(String jerseyNo){
        this.jerseyNo=jerseyNo;
      
    @Override
    //Display Methods
    public String toString(){
        return "SportTeam\n" + "SportTeamName: " + SportTeamName + ", City: " + City + ", ChampionshipsWon: " + ChampionshipsWon + "Coach: " + Coach "jerseyNo"+jerseyNo;
    }
}
