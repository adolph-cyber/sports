// SorterSearcher.java
public class SorterSearcher {

    // Selection Sort: Sort by Age
    public static void selectionSortByAge(Captain[] captains) {
        for (int i = 0; i < captains.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < captains.length; j++) {
                if (captains[j].getAge() < captains[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Captain temp = captains[i];
            captains[i] = captains[minIndex];
            captains[minIndex] = temp;
        }
    }

    // Insertion Sort: Sort by number of ChampionshipsWon
    public static void insertionSort(Captain[] captains){
        for (int i = 1; i < captains.length; i++){
            Captain key = captains[i];
            int j = i - 1;
            while (j >= 0 && captains[j].getChampionshipsWon() > key.getChampionshipsWon()) {
                captains[j + 1] = captains[j];
                j--;
            }
            captains[j + 1] = key;
        }
    }

    // Binary Search: Search for Captain by Age (after sorting)
    public static int binarySearchByAge(Captain[] captains, int age) {
        int low = 0, high = captains.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (captains[mid].getAge() == age) return mid;
            if (captains[mid].getAge() < age) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // Linear Search: Search by Sport
    public static int linearSearchBySport(Captain[] captains, String sport) {
        for (int i = 0; i < captains.length; i++) {
            if (captains[i].getSport().equalsIgnoreCase(sport)) {
                return i;
            }
        }
        return -1;
    }
}
