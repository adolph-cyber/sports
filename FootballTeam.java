
// FootballTeam.java
public class FootballTeam extends SportTeam{

    //FootballTeam Field
    private int conferenceTitles;

    //Constructors to initialize
    public FootballTeam(String name, String city, int championshipsWon, int conferenceTitles){
        super(name, city, championshipsWon);
        this.conferenceTitles = conferenceTitles;
    }

    //Getter for ConferenceTitles
    public int getConferenceTitles(){
        return conferenceTitles;
    }

    //Setter for ConferenceTitles
    public void setConferenceTitles(int conferenceTitles){
        this.conferenceTitles = conferenceTitles;
    }

    @Override
    public String getSportType(){
        return "Basketball";
    }

    @Override
    //Display Method
    public String toString(){
        return super.toString() + ", BasketballTeam\n" + "conferenceTitles: " + conferenceTitles;
    }
}
