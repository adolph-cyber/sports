import java.util.Arrays;

public class MainTeamRunner{
    public static void main(String[] args){
        try{
            Captain[] captains = new Captain[6];
            captains[0] = new Captain("Kaizer Chiefs", "Johannesburg", 55, "Arthur Zwane", "15", "Itumeleng Khune", "Goalkeeper", 36, "Football", "Team Captain");
            captains[1] = new Captain("Orlando Pirates", "Soweto", 40, "Jose Riveiro", "1", "Innocent Maela", "Defender", 31, "Football", "Vice Captain");
            captains[2] = new Captain("Mamelodi Sundowns", "Pretoria", 50, "Rulani Mokwena", "10", "Themba Zwane", "Midfielder", 34, "Football", "Playmaker Captain");
            captains[3] = new Captain("Township Rollers", "Gaborone", 28, "Thabo Motang", "4", "Mpho Kgaswane", "Midfielder", 29, "Football", "Captain");
            captains[4] = new Captain("Gaborone United", "Gaborone", 20, "Pontsho Moloi", "8", "Thatayaone Kgamanyane", "Forward", 27, "Football", "Skipper");
            captains[5] = new Captain("Platinum Stars", "Rustenburg", 35, "Steve Komphela", "12", "Siphelele Mthembu", "Striker", 30, "Football", "Lead Striker");

            System.out.println("=== BEFORE SORTING BY AGE ===");
            for (Captain captain : captains) {
                captain.displayData();
                System.out.println();
            }

            //Demonstrating Selection Sort by Age
            SorterSearcher.selectionSortByAge(captains);

            System.out.println("=== AFTER SORTING BY AGE (Selection Sort) ===");
            for (Captain captain : captains) {
                captain.displayData();
                System.out.println();
            }

            //Demonstrating Insertion Sort by number of championshipsWon 
            SorterSearcher.insertionSort(captains);
            for (Captain s : captains){
                s.displayData();
                System.out.println();
            }

            int ageToSearch = 30;
            int indexBinary = SorterSearcher.binarySearchByAge(captains, ageToSearch);
            if (indexBinary != -1) {
                System.out.println("Binary Search: Captain with age " + ageToSearch + " found → " + captains[indexBinary].getPlayerName());
            } else {
                System.out.println("Binary Search: Captain with age " + ageToSearch + " not found.");
            }

            String sportToSearch = "Football";
            int indexLinear = SorterSearcher.linearSearchBySport(captains, sportToSearch);
            if (indexLinear != -1) {
                System.out.println("Linear Search: Sport '" + sportToSearch + "' found → " + captains[indexLinear].getPlayerName());
            } else {
                System.out.println("Linear Search: Sport '" + sportToSearch + "' not found.");
            }

        } catch (InvalidSportTeamDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
