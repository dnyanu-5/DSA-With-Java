package Loops_and_Conditionals;

public class reverseNumber {
    public static void main(String[] args) {

        int num = 3456;
        int reverse = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num/=10;
        }

        System.out.println("The reverse of number is :"+reverse);
    }
}
