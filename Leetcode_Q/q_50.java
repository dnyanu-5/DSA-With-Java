public class q_50 {
    
    public static double myPow(double x, int n) {
        long N = n; // Use long to handle Integer.MIN_VALUE case
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private static double fastPow(double x, long n) {
        if (n == 0) return 1.0; // Base case
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 5;
        System.out.println(myPow(x, n)); // Output: 32.0
    }
}

