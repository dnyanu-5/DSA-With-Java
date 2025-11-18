package ArrayList;

import java.util.*;

public class BeautifulArr {

    public static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (2 * e - 1<= n)
                    temp.add(e * 2-1);
            }
             for (Integer e : ans) {
                if (2 * e <= n)
                    temp.add(e * 2);
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

}
