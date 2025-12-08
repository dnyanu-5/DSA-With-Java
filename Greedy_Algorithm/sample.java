import java.util.*;

public class sample {
    public static void main(String[] args) {
        System.out.println("practice");

        int val[] = { 60, 100, 120 };
        int wgt[] = { 10, 20, 30 };
        int w = 50;
        // find ratio od val/weights
        int ratios[][] = new int[val.length][2];
        for (int i = 0; i < ratios.length; i++) {
            ratios[i][0] = i;
            ratios[i][1] = val[i] / wgt[i];
        }

        Arrays.sort(ratios, Comparator.comparingDouble(o -> o[1]));

        int ans = 0;

        for (int i = ratios.length - 1; i >= 0; i--) {
            int idx = ratios[i][0];
            if (w > wgt[idx]) {
                ans += val[idx];
                w = w - wgt[idx];
            } else {
                ans += (ratios[i][1] * w);
                w = 0;
                break;
            }
        }

        System.out.println("answer is :" + ans);
    }

}
