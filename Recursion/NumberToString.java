package Recursion;

public class NumberToString {

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static void solution(int num){

        if(num==0){
            return;
        }
        int lastdigit= num %10;
        solution(num/10);
        System.out.println(digits[lastdigit]+" ");
    }
    public static void main(String[] args) {
        int num=1094;
        solution(num);
        System.out.println();
        
    }
}
