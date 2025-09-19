package Recursion;

public class RemoveDuplicate {

    public static void solution(String str, int idx, StringBuilder newstr, boolean map[]) {

        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == false) {
            map[currChar - 'a'] = true;
            solution(str, idx + 1, newstr.append(currChar), map);
        } else {
            solution(str, idx + 1, newstr, map);
        }
    }
    public static void main(String[] args) {
        String str = "dnyanusonawane";
        solution(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
