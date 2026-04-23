package DP;

public class basic {
    public static int fibonaci(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibonaci(n - 1, f) + fibonaci(n - 2, f);
        return f[n];
    }
    public static int fibonaciTauation(int n) {
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n + 1];
        int fib = fibonaci(n, f);
        System.out.println(fib);
        System.out.println(fibonaciTauation(n));
    }

}
