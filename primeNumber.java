package Loops_and_Conditionals;

public class primeNumber {
    public static void main(String[] args) {
        int n = 1165456;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count = 1;
                break;
            }
        }
        if(count==0){
            System.out.println("The number is prime");
        }else{
              System.out.println("The number is not prime");
        }

    }
}
