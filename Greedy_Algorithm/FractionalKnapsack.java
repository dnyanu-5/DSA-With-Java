import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int values[] = { 60, 100, 120 };
        int weights[] = { 10, 20, 30 };
        int w = 50;

        int ratio[][] = new int[values.length][2];
        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / weights[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int ans = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = ratio[i][0];
            if (capacity >= weights[idx]) {
                capacity = capacity - weights[idx];
                ans += values[idx];
            } else {
                ans += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("answer is :" + ans);
    }

}
