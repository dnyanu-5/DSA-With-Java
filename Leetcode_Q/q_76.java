public class q_76 {
    public static String minWindow(String s, String t) {
        //corner case
        if (s.length() < t.length())
            return "";

        //store freq 
        
        int[] freq = new int[128];
        for (char c : t.toCharArray())
            freq[c]++;
        
        //assign varibales
        int left = 0, right = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        //check char present in s str
        while (right < s.length()) {
            char r = s.charAt(right);
            if (freq[r] > 0)
                count--;
            freq[r]--;
            right++;
 
            //we found one string check length
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                char l = s.charAt(left);
                freq[l]++;
                if (freq[l] > 0)
                    count++;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
        System.out.println("hello");

    }
}
