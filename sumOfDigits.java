package Loops_and_Conditionals;

public class sumOfDigits {
    public static void main(String[] args) {

        int num = 3654;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num/=10;
        }
        System.out.println("The sum of the digits is:"+sum);
    }

}
