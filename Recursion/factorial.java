package Recursion;

public class factorial {
    public static int  solution (int n){

        if(n==0){
            return 1;
        }

        int factMone = solution(n-1);
        int fact = n* factMone;

        return fact;

    }
    public static void main(String[] args) {
        System.out.println(solution(5));
        
    }
    
}
