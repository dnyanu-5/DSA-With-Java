package DP;

public class ClimbingStairs {
    public static int findWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return findWays(n - 1) + findWays(n - 2);
    }

    public static int findWaysUsingDp(int n, int dp[]) {
        // memoization -->> o(n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -0) {
            return dp[n]; // already calculate the ways for n
        }
        dp[n] = findWaysUsingDp(n - 1, dp) + findWaysUsingDp(n - 2, dp);
        return dp[n];
    }

    public static int findWaysUsingTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        // q1 -> can take either 1 or 2
        int n = 5;
        System.out.println(findWays(n));
        int dp[] = new int[n + 1];
        System.out.println(findWaysUsingDp(n, dp));
        //using tabulation
        System.out.println(findWaysUsingTabulation(n));

    }

}
