import java.util.*;

public class AggresiveCows {

    static int placedAggresiveCows(int stalls[], int c) {
        Arrays.sort(stalls);
        int n = stalls.length;

        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int minDistance = -1;
                                                    // O(logRange * n)
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(stalls, c, mid)) {
                minDistance = mid;
                low = mid + 1;   
            } else {
                high = mid - 1; 
            }
        }
        return minDistance;
    }

    static boolean isValid(int stalls[], int cows, int minDistance) {
        int cowsPlaced = 1;
        int lastPlacedIndex = 0;

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - stalls[lastPlacedIndex] >= minDistance) {
                cowsPlaced++;
                lastPlacedIndex = i;
            }
        }
        return cowsPlaced >= cows;
    }
    public static void main(String[] args) {
        int stall[] = {1,2,8,4,9};
        int c = 3;
        System.out.println(placedAggresiveCows(stall, c));
    }
}
