package Recursion;

public class Tilling {

    public static int solution(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // work
        // verticle
        // int verticaleWays = solution(n - 1);
        // // horizontal
        // int horizontalWays = solution(n - 2);
        // // total ways
        // int totalWays = verticaleWays + horizontalWays;
        // return totalWays;

        return solution(n-1)+solution(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));

    }

}
