package DP;

public class Knapsack01 {
    public static int knapsackRecursion(int val[], int wgt[], int w, int n) {
        if (w == 0 || n == 0) {
            return 0;
        }
        if (wgt[n - 1] <= w) { // valid
            // include
            int ans1 = val[n - 1] + knapsackRecursion(val, wgt, w - wgt[n - 1], n - 1);
            // exclude
            int ans2 = knapsackRecursion(val, wgt, w, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return knapsackRecursion(val, wgt, w, n - 1);
        }
    }

    public static int knapsackDp(int val[], int wgt[], int w, int n, int dp[][]) {
        if (w == 0 || n == 0) {
            return 0;
        }
        if (dp[n][w] != -1) {
            return dp[n][w];
        }
        if (wgt[n - 1] <= w) { // valid
            // include
            int ans1 = val[n - 1] + knapsackRecursion(val, wgt, w - wgt[n - 1], n - 1);
            // exclude
            int ans2 = knapsackRecursion(val, wgt, w, n - 1);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];
        } else {
            dp[n][w] = knapsackRecursion(val, wgt, w, n - 1);
            return dp[n][w];
        }
    }

    public static int knapsackTab(int val[], int wgt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0; // 0 th col
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0; // 0th row
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wgt[i - 1];
                if (w <= j) {
                    int incProfit = v + dp[i - 1][j - w];
                    int exProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, exProfit);
                } else {
                    int exProfit = dp[i - 1][j];
                    dp[i][j] = exProfit;
                }
            }
        }
        printdp(dp);
        return dp[n][W];
    }

    public static void printdp(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wgt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        System.out.println("using recursion=" +knapsackRecursion(val, wgt, w, val.length));
        // using dp
        int dp[][] = new int[val.length + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("using memoization="+knapsackDp(val, wgt, w, val.length, dp));
        //using tabulations
        System.out.println("using tabulation="+knapsackTab(val, wgt, w)); 
    }

}
