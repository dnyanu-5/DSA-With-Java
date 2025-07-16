package Loops_and_Conditionals;

public class productOfDigits {
    public static void main(String[] args) {

        int num = 934;
        int prod = 1;
        while (num > 0) {
            int digit = num % 10;
            prod *= digit;
            num /= 10;
        }
        System.out.println("The product of the digits is:" + prod);
    }

}
