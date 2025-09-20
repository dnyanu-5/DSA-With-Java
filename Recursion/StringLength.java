package Recursion;

public class StringLength {

    public static int solution(String str) {
        if (str.length()==0) {
            return 0;
        }
       return solution(str.substring(1))+1;
    }

    public static void main(String[] args) {
        String str = "dnyanu";
        System.out.println(solution(str));
    }

}
