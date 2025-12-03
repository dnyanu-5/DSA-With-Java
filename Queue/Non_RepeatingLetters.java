package Queue;
import java.util.*;

public class Non_RepeatingLetters {

    public static void firstNonRepeatLetter(String str) {
        Queue<Character> q = new LinkedList<>();
        int frqe[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            frqe[ch - 'a']++;

            while (!q.isEmpty() && frqe[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(q.peek());
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("first non-repeating letters in a stream using queue");
        String str = "aabccxbd";
        firstNonRepeatLetter(str);
    }

}
