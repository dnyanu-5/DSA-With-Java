package Heaps;

import java.util.*;

public class WeakSoldier {

    static class row implements Comparable<row> {
        int soldiers;
        int idx;

        public row(int sol, int i) {
            this.soldiers = sol;
            this.idx = i;
        }

        @Override
        public int compareTo(row r) {
            if (this.soldiers == r.soldiers) {
                return this.idx - r.idx;
            } else {
                return this.soldiers - r.soldiers;
            }
        }
    }
    public static void main(String[] args) {

        PriorityQueue<row> p = new PriorityQueue<>();

        int army[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };

        int k = 2;

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j];
            }
            p.add(new row(count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("row " + p.poll().idx);
        }
    }
}
