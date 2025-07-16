package Loops_and_Conditionals;

public class leapYear {
    public static void main(String[] args) {
        int year = 2010;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year " + year + " is a leap year");
                } else {
                    System.out.println("The year " + year + " is not a leap year");
                }
            } else {
                System.out.println("The year " + year + " is a leap year");
            }
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }

    }
}
