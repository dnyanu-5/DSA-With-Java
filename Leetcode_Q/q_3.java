import java.util.HashSet;

public class q_3 {

    public static int lengthOfSubstring(String str) {

        int left = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println( lengthOfSubstring(str));
    }
}
