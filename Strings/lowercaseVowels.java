package Strings;

import java.util.*;

public class lowercaseVowels {

    public static int numberofVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("enter input:" + input);
        System.out.println("number of vowels:"+numberofVowels(input));
        sc.close();

    }

}
