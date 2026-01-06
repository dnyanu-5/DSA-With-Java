public class q_76_max {
    public static String minWindow(String s, String t) {
        // corner case
        if (s.length() < t.length())
            return "";

        // store freq

        int[] freq = new int[128];
        for (char c : t.toCharArray())
            freq[c]++;

        // assign varibales
        int left = 0, right = 0;
        int count = t.length();
        int maxLen = 0;
        int start = 0;

        // check char present in s str
        while (right < s.length()) {
            char r = s.charAt(right);
            if (freq[r] > 0)
                count--;
            freq[r]--;
            right++;

            // we found one string check length
            if (count == 0) {
                // try to expand to the end
                while (right < s.length()) {
                    char nr = s.charAt(right);
                    freq[nr]--;
                    right++;
                }
                maxLen = right - left;
                start = left;
                break; // max window found
            }
        }
        return maxLen == Integer.MIN_VALUE ? "" : s.substring(start, start + maxLen);

    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));

    }
}
