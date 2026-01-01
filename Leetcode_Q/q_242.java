import java.util.Arrays;

public class q_242 {
    public static void main(String[] args) {
        String str1 = "Earth";
        String str2 = "Heart";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length() == str2.length()) {

            // o(nlogn)
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean isAnagram = Arrays.equals(arr1, arr2);

            if (isAnagram) {
                System.out.println("anagram");
            } else {
                System.out.println("not an anagram");
            }

        } else {
            System.out.println("not an anagran");
        }
    }
}