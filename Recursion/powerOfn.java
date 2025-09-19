package Recursion;

public class powerOfn {

    public static int solution(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * solution(x, n - 1);
    }

    public static int solution2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half = solution2(x, n / 2);
        int halfsq = half * half;

        if (n % 2 != 0) {
            halfsq = x * halfsq;
        }
        return halfsq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(solution(x, n));
        System.out.println(solution2(x, n));

    }

}