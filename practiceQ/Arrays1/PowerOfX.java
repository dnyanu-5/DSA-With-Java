package practiceQ.Arrays1;

public class PowerOfX {

    public static double solution(double x, long n) {
        if (n == 0) {
            return 1; // base case: x^0 = 1
        }
        if (n < 0) {
            return 1 / solution(x, -n); // handle negative powers
        }
        if (n % 2 == 1) {
            return x * solution(x, n - 1); // if odd, multiply once and reduce exponent
        }
        return solution(x * x, n / 2); // if even, square x and halve exponent
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        double result = solution(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}
