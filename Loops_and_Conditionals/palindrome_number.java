package Loops_and_Conditionals;

public class palindrome_number {
    public static void main(String[] args) {
        int num = 123261;
        int originalNum = num;
        int reverse = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }

        if (originalNum == reverse) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
    
}
