import java.util.*;

public class q_56 {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] ans = s.merge(intervals);

        for (int[] a : ans) {
            System.out.println(a[0] + " " + a[1]);
        }
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][]);
    }
}
