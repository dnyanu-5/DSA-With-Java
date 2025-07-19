package Loops_and_Conditionals;

public class armstrong_number {
    public static void main(String[] args) {

        int num = 153;
        int original = num;
        int armNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            armNum += lastDigit * lastDigit * lastDigit; // (cube of number)
            num /= 10;
        }

        if(armNum == original){
            System.out.println("The number is Armstrong number");
        }else{
            System.out.println("The number is not a Armstrong number");
        }
    }

}
