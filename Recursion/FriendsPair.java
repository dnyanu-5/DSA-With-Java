package Recursion;

public class FriendsPair {

    public static int solution(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // int single = solution(n - 1);
        // int pair = solution(n - 2);
        // int pairWays = (n - 1) * pair;
        // int totalWays = single + pairWays;
        // return totalWays;

        return solution(n-1) + solution(n-2)*(n-1);
    }

    public static void main(String[] args) {

        int num = 3;
        System.out.println(solution(num));
    }

}
