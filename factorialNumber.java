package Loops_and_Conditionals;
public class factorialNumber{
    public static void main(String[] args) {
        
        int n =5;
        int fact =1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }

        System.out.println("The factorial of number is:"+fact);


    } 
}