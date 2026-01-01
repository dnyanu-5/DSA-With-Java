package Heaps;

import java.util.*;

public class SlidingWindow {
    static class pair implements Comparable<pair> {
        int num;
        int idx;

        public pair(int n, int idx) {
            this.num = n;
            this.idx = idx;
        }

        @Override
        public int compareTo(pair p) {
            return p.num - this.num;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new pair(arr[i], i));
        }
        res[0] = pq.peek().num;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }

            pq.add(new pair(arr[i], i));
            res[i - k + 1] = pq.peek().num;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

}
