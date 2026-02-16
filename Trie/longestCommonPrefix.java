package Trie;

public class longestCommonPrefix {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int childcount;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            childcount = 0;
        }
    }

    public static Node root = new Node();

    public static void insert(String words) {

        Node curr = root;
        for (int level = 0; level < words.length(); level++) {
            int idx = words.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
                curr.childcount++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String lonestPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        for (String s : strs) {
            insert(s);
        }
        StringBuilder ans = new StringBuilder();
        Node curr = root;

        while (curr.childcount == 1 && curr.eow==false) {
            for (int i = 0; i < 26; i++) {
                if (curr.children[i] != null) {
                    ans.append((char) (i + 'a'));
                    curr = curr.children[i];
                    break;
                }
            }
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String str[] = { "flowers", "flow", "flight" };
        System.out.println(lonestPrefix(str));

    }

}
