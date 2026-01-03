import java.util.*;

public class hashExamples {

    public static int majorityEle(int nums[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // if (!hm.containsKey(nums[i])) {
            // hm.put(nums[i], 1);
            // } else {
            // hm.put(nums[i], hm.get(nums[i]) + 1);
            // }
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer i : hm.keySet()) {
            if (hm.get(i) > nums.length / 2) {
                // System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static boolean anagramPharse(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) { // value exists
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static String sortCharacters(String str) {

    // 1. Count frequency
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
        char curr = str.charAt(i);
        map.put(curr, map.getOrDefault(curr, 0) + 1);
    }
    // 2. Store characters in list
    List<Character> al = new ArrayList<>(map.keySet());
    al.sort((a, b) -> map.get(b) - map.get(a));

    // Build result
    StringBuilder sb = new StringBuilder();
    for (char c : al) {
        int freq = map.get(c);
        for (int j = 0; j < freq; j++) {
            sb.append(c);
        }
    }

    return sb.toString();
}
    public static void main(String[] args) {
        // int nums[] = { 2, 2, 1, 1, 1, 2, 2, 2 };
        // System.out.println(majorityEle(nums));

        // String s = "tulip";
        // String t = "liqid";
        // System.out.println(anagramPharse(s, t));

        String s1 = "tree";
        System.out.println(sortCharacters(s1));

    }

}
