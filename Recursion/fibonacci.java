package Recursion;

public class fibonacci {

    public static int solution(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        // int nm1 = solution(n - 1);
        // int nm2 = solution(n - 2);
        // int fib = nm1 + nm2;
        // return fib;

        return solution(n-1) + solution(n-2);
    }

    public static void main(String[] args) {
        System.out.println(solution(8));

    }

}
