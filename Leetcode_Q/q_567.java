public class q_567 {

    public static boolean checkPermutation(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int freq[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windowLength = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            int winIdx = 0;
            int idx = i;
            int window[] = new int[26];

            while (winIdx < windowLength && idx < s2.length()) {
                window[s2.charAt(idx) - 'a']++;
                winIdx++;
                idx++;
            }

            if (isFreqSame(freq, window)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isFreqSame(int frq[], int window[]) {
        for (int j = 0; j < 26; j++) {
            if (frq[j] != window[j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPermutationOptimal(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;         // o(n)
        } // first window is checked
        if (isFreqSame(freq1, freq2)) {
            return true;
        }
        int left = 0;
        // n th  window checked
        for (int right = s1.length(); right < s2.length(); right++) {
            freq2[s2.charAt(right) - 'a']++;
            freq2[s2.charAt(left) - 'a']--; // remove left char
            left++;

            if (isFreqSame(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ac";
        String s2 = "eidbaooo";

        System.out.println(checkPermutation(s1, s2));
        System.out.println(checkPermutationOptimal(s1,s2));
    }

}
