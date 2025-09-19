package Recursion;

public class sumOfn {
    public static int solution(int n) {
        if (n == 1) {
            return 1;
        }
        int n1 = solution(n - 1);
        int sum = n + n1;
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

    }

}
