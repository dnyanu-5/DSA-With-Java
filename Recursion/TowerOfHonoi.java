package Recursion;

public class TowerOfHonoi {
    public static void solution(int n,String source,String helper,String dest){

        if( n==1){
            System.out.println("disk "+n+" is transferd from "+source+" to "+dest);
            return;
        }

        solution(n-1, source,dest,helper);
        System.out.println("disk "+n+" is transferd from "+source+" to "+dest);
        solution(n-1, helper, source, dest);

    }
    public static void main(String[] args) {
        int n=3;
        solution(n, "Source", "Helper", "Destination");
    }
    
}
