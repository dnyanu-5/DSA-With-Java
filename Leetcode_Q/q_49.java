import java.util.*;

public class q_49 {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int freq[] = new int[26];
            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();

            for (int i : freq) {
                sb.append(i);
                sb.append("#");
            }
            String key = sb.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());

    }
    public static void main(String[] args) {

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> result = groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }

}
